package com.hathey.service.user.impl;

import com.hathey.domain.user.EmployeeRace;
import com.hathey.factory.user.EmployeeRaceFactory;
import com.hathey.repository.user.impl.EmployeeRaceRepositoryImpl;
import com.hathey.service.user.EmployeeRaceService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRaceServiceImplTest {
    private EmployeeRaceRepositoryImpl repository;
    private EmployeeRace employeeRace;
    private EmployeeRaceService service;


    @Before
    public void setUp() throws Exception {
        this.service = EmployeeRaceServiceImpl.getEmployeeRaceService();
    }

    @Test
    public void a_create() {
        EmployeeRace employee = EmployeeRaceFactory.buildEmployeeRace("567", "098");

        service.create(employee);

        EmployeeRace inRepo = service.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        EmployeeRace employee = EmployeeRaceFactory.buildEmployeeRace("567", "098");

        service.create(employee);
        EmployeeRace inRepo = service.read(employee.getEmployeeNumber());

        employee.setEmployeeNumber("765");

        service.update(employee);

        Assert.assertEquals(employee.getEmployeeNumber(), inRepo.getEmployeeNumber());
    }

    @Test
    public void e_delete() {
        EmployeeRace employee = EmployeeRaceFactory.buildEmployeeRace("567", "098");

        service.create(employee);

        EmployeeRace inRepo = service.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getEmployeeNumber());

        EmployeeRace deleted = service.read(employee.getEmployeeNumber());

        Assert.assertNull(deleted);
    }

    @Test
    public void b_read() {
        EmployeeRace employee = EmployeeRaceFactory.buildEmployeeRace("567", "098");

        service.create(employee);

        EmployeeRace inRepo = service.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<EmployeeRace> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }
}