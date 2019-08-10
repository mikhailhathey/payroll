package com.hathey.service.user.impl;

import com.hathey.domain.user.Employee;
import com.hathey.factory.user.EmployeeFactory;
import com.hathey.repository.user.impl.EmployeeRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceImplTest {
    private EmployeeRepositoryImpl repository;
    private Employee employee;

    private Employee getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (EmployeeRepositoryImpl) EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.buildEmployee("Mikhail", "Hathey");
    }

    @Test
    public void a_create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.employee);
    }

    @Test
    public void c_update() {
        String newEmployeeName = "Mikhail";
        Employee updated = new Employee.Builder().copy(getSaved()).employeeFirstName(newEmployeeName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newEmployeeName, updated.getEmployeeFirstName());
    }

    @Test
    public void e_delete() {
        Employee saved = getSaved();
        this.repository.delete(saved.getEmployeeFirstName());
        d_getAll();
    }

    @Test
    public void b_read() {
        Employee saved = getSaved();
        Employee read = this.repository.read(saved.getEmployeeFirstName());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Employee> employee = this.repository.getAll();
        System.out.println("In getall, all = " + employee);
    }
}