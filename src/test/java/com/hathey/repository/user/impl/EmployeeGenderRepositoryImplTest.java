package com.hathey.repository.user.impl;

import com.hathey.domain.user.Employee;
import com.hathey.domain.user.EmployeeGender;
import com.hathey.factory.user.EmployeeGenderFactory;
import com.hathey.repository.user.EmployeeGenderRepository;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeGenderRepositoryImplTest {

    private EmployeeGenderRepository employeeGenderRepository;
    private EmployeeGender employeeGender;

    private EmployeeGender getSavedEmployeeGender(){
        Set<EmployeeGender> savedEmployeeGenders = this.employeeGenderRepository.getAll();
        return savedEmployeeGenders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        /*this.employeeGenderRepository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.buildEmployeeGender("Mikhail", "Hathey");*/
        this.employeeGenderRepository = EmployeeGenderRepositoryImpl.getRepository();
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void a_create() {
        /*EmployeeGender created = this.employeeGenderRepository.create(this.employeeGender);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.employeeGender);*//*
        EmployeeGender e = EmployeeGenderFactory.buildEmployeeGender("Mikhail", "Hathey");
        EmployeeGender savedE = this.employeeGenderRepository.create(e);
        Assert.assertEquals(2, this.employeeGenderRepository.getAll().size());*/

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("123", "789");

        employeeGenderRepository.create(employee);

        EmployeeGender inRepo = employeeGenderRepository.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void b_update() {
        /*String newname = "New Test Employee Gender Name created";
        EmployeeGender employeeGender = new EmployeeGender.Builder().copy(getSavedEmployeeGender()).employeeNumber(newname).build();
        System.out.println("In update, about to be updated = " + employeeGender);
        EmployeeGender updated = this.employeeGenderRepository.update(employeeGender);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getEmployeeNumber());
        d_getAll();*/

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("123", "789");

        employeeGenderRepository.create(employee);
        EmployeeGender inRepo = employeeGenderRepository.read(employee.getEmployeeNumber());

        employee.setEmployeeNumber("456");

        employeeGenderRepository.update(employee);

        Assert.assertEquals(employee.getEmployeeNumber(), inRepo.getEmployeeNumber());
    }

    @Test
    public void e_delete() {
        /*EmployeeGender savedEmployeeGender = getSavedEmployeeGender();
        this.employeeGenderRepository.delete(savedEmployeeGender.getEmployeeNumber());
        d_getAll();*/

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("123", "789");

        employeeGenderRepository.create(employee);

        EmployeeGender inRepo = employeeGenderRepository.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);

        employeeGenderRepository.delete(employee.getEmployeeNumber());

        EmployeeGender deleted = employeeGenderRepository.read(employee.getEmployeeNumber());

        Assert.assertNull(deleted);
    }

    @Test
    public void c_read() {
        /*EmployeeGender savedEmployeeGender = getSavedEmployeeGender();
        System.out.println("In read, employee gender id = " + savedEmployeeGender.getEmployeeNumber());
        EmployeeGender read = this.employeeGenderRepository.read(savedEmployeeGender.getEmployeeNumber());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedEmployeeGender, read);*/

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("123", "789");

        employeeGenderRepository.create(employee);

        EmployeeGender inRepo = employeeGenderRepository.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        /*Set<EmployeeGender> all = this.employeeGenderRepository.getAll();
        System.out.println("In getAll, all = " + all);
        //Assert.assertSame(1, all.size());*/

        Set<EmployeeGender> employeeSet = employeeGenderRepository.getAll();
        Assert.assertNotNull(employeeSet);
    }
}