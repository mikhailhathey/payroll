package com.hathey.factory.user;

import com.hathey.domain.user.EmployeeRace;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceFactoryTest {
    private String EmployeeRaceTest;

    @Before
    public void setUp() throws Exception {
        this.EmployeeRaceTest = "EmployeeRaceTest";
    }

    @Test
    public void buildEmployeeRace() {
        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("123456", "654321");
        System.out.println(employeeRace);
        Assert.assertNotNull(employeeRace.getEmployeeNumber());
    }
}