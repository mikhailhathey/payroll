package com.hathey.controller.user;

import com.hathey.domain.demography.Gender;
import com.hathey.domain.demography.Race;
import com.hathey.domain.user.Employee;
import com.hathey.domain.user.EmployeeGender;
import com.hathey.domain.user.EmployeeRace;
import com.hathey.factory.demography.GenderFactory;
import com.hathey.factory.demography.RaceFactory;
import com.hathey.factory.user.EmployeeFactory;
import com.hathey.factory.user.EmployeeGenderFactory;
import com.hathey.factory.user.EmployeeRaceFactory;
import com.hathey.service.demography.GenderService;
import com.hathey.service.demography.RaceService;
import com.hathey.service.demography.impl.GenderServiceImpl;
import com.hathey.service.demography.impl.RaceServiceImpl;
import com.hathey.service.user.EmployeeGenderService;
import com.hathey.service.user.EmployeeRaceService;
import com.hathey.service.user.EmployeeService;
import com.hathey.service.user.impl.EmployeeGenderServiceImpl;
import com.hathey.service.user.impl.EmployeeRaceServiceImpl;
import com.hathey.service.user.impl.EmployeeServiceImpl;

import java.util.Set;

public class EmployeeController {

    private EmployeeService employeeService = EmployeeServiceImpl.getEmployeeService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getEmployeeGenderService();
    private EmployeeRaceService employeeRaceService = EmployeeRaceServiceImpl.getEmployeeRaceService();
    private RaceService raceService = RaceServiceImpl.getRaceService();
    private GenderService genderService = GenderServiceImpl.getGenderService();

    public void create(String firstName, String lastName, int genderId, int raceId){

        Employee employee = EmployeeFactory.buildEmployee(firstName, lastName);
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("123", "456");
        employeeGenderService.create(employeeGender);

        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("567", "987");
        employeeRaceService.create(employeeRace);

        Race race = RaceFactory.buildRace("Indian");
        raceService.create(race);

        Gender gender = GenderFactory.buildGender("Male");
        genderService.create(gender);


    }


}
