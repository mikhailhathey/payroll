package com.hathey.service.user.impl;

import com.hathey.domain.user.EmployeeGender;
import com.hathey.factory.user.EmployeeGenderFactory;
import com.hathey.repository.user.impl.EmployeeGenderRepositoryImpl;
import com.hathey.service.user.EmployeeGenderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeGenderServiceImplTest {
    private EmployeeGenderRepositoryImpl repository;
    private EmployeeGender employeeGender;
    private EmployeeGenderService service;


    @Before
    public void setUp() throws Exception {
        this.service = EmployeeGenderServiceImpl.getEmployeeGenderService();
    }

    @Test
    public void a_create() {
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("567", "098");

        service.create(employee);

        EmployeeGender inRepo = service.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("567", "098");

        service.create(employee);
        EmployeeGender inRepo = service.read(employee.getEmployeeNumber());

        employee.setEmployeeNumber("765");

        service.update(employee);

        Assert.assertEquals(employee.getEmployeeNumber(), inRepo.getEmployeeNumber());
    }

    @Test
    public void e_delete() {
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("567", "098");

        service.create(employee);

        EmployeeGender inRepo = service.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getEmployeeNumber());

        EmployeeGender deleted = service.read(employee.getEmployeeNumber());

        Assert.assertNull(deleted);
    }

    @Test
    public void b_read() {
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("567", "098");

        service.create(employee);

        EmployeeGender inRepo = service.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<EmployeeGender> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }
}