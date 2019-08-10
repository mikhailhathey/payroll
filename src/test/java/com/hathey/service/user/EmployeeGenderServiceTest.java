package com.hathey.service.user;

import com.hathey.domain.user.EmployeeGender;
import com.hathey.factory.user.EmployeeGenderFactory;
import com.hathey.repository.user.EmployeeGenderRepository;
import com.hathey.repository.user.impl.EmployeeGenderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderServiceTest {
    private EmployeeGenderRepository repository;
    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.buildEmployeeGender("Mikhail", "Hathey");
    }


    @Test
    public void getAll(){
        Set<EmployeeGender> employeeGender = this.repository.getAll();
        System.out.println("In getall, all = " + employeeGender);
    }

}