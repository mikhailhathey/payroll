package com.hathey.service.demography.impl;

import com.hathey.domain.demography.Race;
import com.hathey.factory.demography.RaceFactory;
import com.hathey.repository.demography.impl.RaceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceImplTest {
    private RaceRepositoryImpl repository;
    private Race race;

    private Race getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.buildRace("Indian");
    }

    @Test
    public void a_create() {
        Race created = this.repository.create(this.race);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.race);
    }

    @Test
    public void c_update() {
        String newRaceName = "Indian";
        Race updated = new Race.Builder().copy(getSaved()).description(newRaceName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newRaceName, updated.getDescription());
    }

    @Test
    public void e_delete() {
        Race saved = getSaved();
        this.repository.delete(saved.getDescription());
        d_getAll();
    }

    @Test
    public void b_read() {
        Race saved = getSaved();
        Race read = this.repository.read(saved.getDescription());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Race> race = this.repository.getAll();
        System.out.println("In getall, all = " + race);
    }
}