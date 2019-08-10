package com.hathey.service.user.impl;

import com.hathey.domain.user.EmployeeGender;
import com.hathey.factory.user.EmployeeGenderFactory;
import com.hathey.repository.user.impl.EmployeeGenderRepositoryImpl;
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

    private EmployeeGender getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (EmployeeGenderRepositoryImpl) EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.buildEmployeeGender("", "");
    }

    @Test
    public void a_create() {
        EmployeeGender created = this.repository.create(this.employeeGender);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.employeeGender);
    }

    @Test
    public void c_update() {
        String newEmployeeGenderName = "Male";
        EmployeeGender updated = new EmployeeGender.Builder().copy(getSaved()).employeeNumber(newEmployeeGenderName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newEmployeeGenderName, updated.getEmployeeNumber());
    }

    @Test
    public void e_delete() {
        EmployeeGender saved = getSaved();
        this.repository.delete(saved.getEmployeeNumber());
        d_getAll();
    }

    @Test
    public void b_read() {
        EmployeeGender saved = getSaved();
        EmployeeGender read = this.repository.read(saved.getEmployeeNumber());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<EmployeeGender> employeeGender = this.repository.getAll();
        System.out.println("In getall, all = " + employeeGender);
    }
}