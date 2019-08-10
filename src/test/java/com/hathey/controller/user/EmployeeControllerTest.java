package com.hathey.controller.user;

import com.hathey.domain.demography.Gender;
import com.hathey.domain.demography.Race;
import com.hathey.domain.user.Employee;
import com.hathey.domain.user.EmployeeGender;
import com.hathey.factory.demography.GenderFactory;
import com.hathey.factory.demography.RaceFactory;
import com.hathey.factory.user.EmployeeFactory;
import com.hathey.factory.user.EmployeeGenderFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeControllerTest {


    private EmployeeController employeeController;


    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }

    @Test
    public void create() {

        Gender gender = GenderFactory.buildGender("Male");
        Race race = RaceFactory.buildRace("Indian");
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("123", "123");
        Employee employee = EmployeeFactory.buildEmployee("Mikhail", "Hathey");

        //employeeController.create(employee.getEmployeeNumber(), employee.getEmployeeFirstName() ,employee.getEmployeeLastName(), gender.getId(),race.getId());

        employeeController.create("Mikhail", "Hathey", 123, 456);

    }
}