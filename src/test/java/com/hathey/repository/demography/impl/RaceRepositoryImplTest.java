package com.hathey.raceRepository.demography.impl;

import com.hathey.domain.demography.Race;
import com.hathey.factory.demography.RaceFactory;
import com.hathey.repository.demography.RaceRepository;
import com.hathey.repository.demography.impl.RaceRepositoryImpl;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceRepositoryImplTest {

    private RaceRepository raceRepository;
    private Race race;

    private Race getSavedRace(){
        Set<Race> savedRaces = this.raceRepository.getAll();
        return savedRaces.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
/*        this.raceRepository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.buildRace("Indian");*/
        this.raceRepository = RaceRepositoryImpl.getRepository();
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void a_create() {
        /*Race created = this.raceRepository.create(this.race);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.race);*//*
        Race e = RaceFactory.buildRace("Indian");
        Race savedE = this.raceRepository.create(e);
        Assert.assertEquals(2, this.raceRepository.getAll().size());*/

        Race employee = RaceFactory.buildRace("Indian");

        raceRepository.create(employee);

        Race inRepo = raceRepository.read(employee.getDescription());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void b_update() {
        /*String newname = "New Test Race Name created";
        Race race = new Race.Builder().copy(getSavedRace()).description(newname).build();
        System.out.println("In update, about to be updated = " + race);
        Race updated = this.raceRepository.update(race);
        System.out.println("In update, updated = " + updated);
        //Assert.assertSame(newname, updated.getDescription());
        Assert.assertNotSame(newname, updated.getDescription());
        d_getAll();*/

        Race employee = RaceFactory.buildRace("Female");

        raceRepository.create(employee);
        Race inRepo = raceRepository.read(employee.getId());

        employee.setDescription("Mikhail Hathey");

        raceRepository.update(employee);

        Assert.assertEquals(employee.getDescription(), inRepo.getDescription());
    }

    @Test
    public void e_delete() {
        /*Race savedRace = getSavedRace();
        this.raceRepository.delete(savedRace.getDescription());
        d_getAll();*/

        Race employee = RaceFactory.buildRace("Female");

        raceRepository.create(employee);

        Race inRepo = raceRepository.read(employee.getDescription());

        Assert.assertNotNull(inRepo);

        raceRepository.delete(employee.getDescription());

        Race deleted = raceRepository.read(employee.getDescription());

        Assert.assertNull(deleted);
    }

    @Test
    public void c_read() {
        /*Race savedRace = getSavedRace();
        System.out.println("In read, race id = " + savedRace.getDescription());
        Race read = this.raceRepository.read(savedRace.getDescription());
        System.out.println("In read, read = " + read);
        d_getAll();
        //Assert.assertEquals(savedRace, read);
        Assert.assertNotEquals(savedRace, read);*/
        Race employee = RaceFactory.buildRace("Female");

        raceRepository.create(employee);

        Race inRepo = raceRepository.read(employee.getDescription());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void d_getAll() {
        /*Set<Race> all = this.raceRepository.getAll();
        System.out.println("In getAll, all = " + all);
        //Assert.assertSame(1, all.size());*/

        Set<Race> employeeSet = raceRepository.getAll();
        Assert.assertNotNull(employeeSet);

    }
}