package com.hathey.repository.demography.impl;

import com.hathey.domain.demography.Gender;
import com.hathey.factory.demography.GenderFactory;
import com.hathey.repository.demography.GenderRepository;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {

    private GenderRepository genderRepository;
    private Gender gender;

    private Gender getSavedGender(){
        Set<Gender> savedGenders = this.genderRepository.getAll();
        return savedGenders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.genderRepository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.buildGender("Male");
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void a_create() {
        /*Gender created = this.genderRepository.create(this.gender);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.gender);*/
        Gender e = GenderFactory.buildGender("Male");
        Gender savedE = this.genderRepository.create(e);
        Assert.assertEquals(1, this.genderRepository.getAll().size());
    }

    @Test
    public void b_update() {
        String newname = "New Test Gender Name created";
        Gender gender = new Gender.Builder().copy(getSavedGender()).description(newname).build();
        System.out.println("In update, about to be updated = " + gender);
        Gender updated = this.genderRepository.update(gender);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getDescription());
        d_getAll();
    }

    @Test
    public void e_delete() {
        Gender savedGender = getSavedGender();
        this.genderRepository.delete(savedGender.getDescription());
        d_getAll();
    }

    @Test
    public void c_read() {
        Gender savedGender = getSavedGender();
        System.out.println("In read, gender id = " + savedGender.getDescription());
        Gender read = this.genderRepository.read(savedGender.getDescription());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedGender, read);
    }

    @Test
    public void d_getAll() {
        Set<Gender> all = this.genderRepository.getAll();
        System.out.println("In getAll, all = " + all);
        //Assert.assertSame(1, all.size());
    }
}