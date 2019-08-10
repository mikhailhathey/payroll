package com.hathey.service.demography.impl;

import com.hathey.domain.demography.Gender;
import com.hathey.factory.demography.GenderFactory;
import com.hathey.repository.demography.impl.GenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderServiceImplTest {
    private GenderRepositoryImpl repository;
    private Gender gender;

    private Gender getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.buildGender("Indian");
    }

    @Test
    public void a_create() {
        Gender created = this.repository.create(this.gender);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.gender);
    }

    @Test
    public void c_update() {
        String newGenderName = "Indian";
        Gender updated = new Gender.Builder().copy(getSaved()).description(newGenderName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newGenderName, updated.getDescription());
    }

    @Test
    public void e_delete() {
        Gender saved = getSaved();
        this.repository.delete(saved.getDescription());
        d_getAll();
    }

    @Test
    public void b_read() {
        Gender saved = getSaved();
        Gender read = this.repository.read(saved.getDescription());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Gender> gender = this.repository.getAll();
        System.out.println("In getall, all = " + gender);
    }
}