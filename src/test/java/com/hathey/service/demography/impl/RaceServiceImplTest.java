package com.hathey.service.demography.impl;

import com.hathey.domain.demography.Race;
import com.hathey.factory.demography.RaceFactory;
import com.hathey.repository.demography.impl.RaceRepositoryImpl;
import com.hathey.service.demography.RaceService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceServiceImplTest {
    private RaceRepositoryImpl repository;
    private Race race;
    private RaceService service;


    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImpl.getRaceService();
    }

    @Test
    public void a_create() {
        Race employee = RaceFactory.buildRace("Indian");

        service.create(employee);

        Race inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        Race employee = RaceFactory.buildRace("Indian");

        service.create(employee);
        Race inRepo = service.read(employee.getId());

        employee.setDescription("Mikhail");

        service.update(employee);

        Assert.assertEquals(employee.getId(), inRepo.getId());
    }

    @Test
    public void e_delete() {
        Race employee = RaceFactory.buildRace("Indian");

        service.create(employee);

        Race inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getId());

        Race deleted = service.read(employee.getId());

        Assert.assertNull(deleted);
    }

    @Test
    public void b_read() {
        Race employee = RaceFactory.buildRace("Indian");

        service.create(employee);

        Race inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<Race> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }
}