package com.hathey.controller.user;

import com.hathey.domain.demography.Gender;
import com.hathey.domain.demography.Race;
import com.hathey.domain.user.Employee;
import com.hathey.domain.user.EmployeeGender;
import com.hathey.factory.demography.GenderFactory;
import com.hathey.factory.demography.RaceFactory;
import com.hathey.factory.user.EmployeeFactory;
import com.hathey.factory.user.EmployeeGenderFactory;
import com.hathey.service.demography.GenderService;
import com.hathey.service.demography.RaceService;
import com.hathey.service.demography.impl.GenderServiceImpl;
import com.hathey.service.demography.impl.RaceServiceImpl;
import com.hathey.service.user.EmployeeGenderService;
import com.hathey.service.user.EmployeeService;
import com.hathey.service.user.impl.EmployeeGenderServiceImpl;
import com.hathey.service.user.impl.EmployeeServiceImpl;

import java.util.Set;

public class EmployeeController {

    private EmployeeService employeeService = EmployeeServiceImpl.getEmployeeService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getEmployeeGenderService();
    private RaceService raceService = RaceServiceImpl.getRaceService();
    private GenderService genderService = GenderServiceImpl.getGenderService();

    public void create(int empId, String firstName, String lastName, int genderId, int raceId){

        Employee employee = EmployeeFactory.buildEmployee(empId, firstName, lastName);
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(empId, genderId);
        employeeGenderService.create(employeeGender);

        Race race = RaceFactory.buildRace(raceId, "Race");
        raceService.create(race);

        Gender gender = GenderFactory.buildGender(genderId, "123");
        genderService.create(gender);


    }


}
