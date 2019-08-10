package com.hathey.factory.user;

import com.hathey.domain.user.EmployeeGender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {


    private String EmployeeGenderTest;

    @Before
    public void setUp() throws Exception {
        this.EmployeeGenderTest = "EmployeeGenderTest";
    }

    @Test
    public void buildEmployeeGender() {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("123456", "654321");
        System.out.println(employeeGender);
        Assert.assertNotNull(employeeGender.getEmployeeNumber());
    }
}