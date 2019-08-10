package com.hathey.service.user;

import com.hathey.domain.user.Employee;
import com.hathey.factory.user.EmployeeFactory;
import com.hathey.repository.user.EmployeeRepository;
import com.hathey.repository.user.impl.EmployeeRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceTest {
    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.buildEmployee("Mikhail", "Hathey");
    }


    @Test
    public void getAll(){
        Set<Employee> employee = this.repository.getAll();
        System.out.println("In getall, all = " + employee);
    }

}