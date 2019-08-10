package com.hathey.service.demography.impl;

import com.hathey.domain.demography.Gender;
import com.hathey.domain.demography.Gender;
import com.hathey.factory.demography.GenderFactory;
import com.hathey.factory.demography.GenderFactory;
import com.hathey.repository.demography.impl.GenderRepositoryImpl;
import com.hathey.service.demography.GenderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderServiceImplTest {
    private GenderRepositoryImpl repository;
    private Gender gender;
    private GenderService service;


    @Before
    public void setUp() throws Exception {
        this.service = GenderServiceImpl.getGenderService();
    }

    @Test
    public void a_create() {
        Gender employee = GenderFactory.buildGender("Male");

        service.create(employee);

        Gender inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        Gender employee = GenderFactory.buildGender("Male");

        service.create(employee);
        Gender inRepo = service.read(employee.getId());

        employee.setDescription("Mikhail");

        service.update(employee);

        Assert.assertEquals(employee.getId(), inRepo.getId());
    }

    @Test
    public void e_delete() {
        Gender employee = GenderFactory.buildGender("Male");

        service.create(employee);

        Gender inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getId());

        Gender deleted = service.read(employee.getId());

        Assert.assertNull(deleted);
    }

    @Test
    public void b_read() {
        Gender employee = GenderFactory.buildGender("Male");

        service.create(employee);

        Gender inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<Gender> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }
}