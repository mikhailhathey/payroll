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
import com.hathey.repository.demography.GenderRepository;
import com.hathey.repository.demography.RaceRepository;
import com.hathey.repository.demography.impl.GenderRepositoryImpl;
import com.hathey.repository.demography.impl.RaceRepositoryImpl;
import com.hathey.repository.user.EmployeeGenderRepository;
import com.hathey.repository.user.EmployeeRaceRepository;
import com.hathey.repository.user.EmployeeRepository;
import com.hathey.repository.user.impl.EmployeeGenderRepositoryImpl;
import com.hathey.repository.user.impl.EmployeeRaceRepositoryImpl;
import com.hathey.repository.user.impl.EmployeeRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeControllerTest {

    private EmployeeController employeeController;

    private EmployeeRepository employeeRepository;
    private Employee employee;

    private GenderRepository genderRepository;
    private Gender gender;

    private RaceRepository raceRepository;
    private Race race;

    private EmployeeRaceRepository employeeRaceRepository;
    private EmployeeRace employeeRace;

    private EmployeeGenderRepository employeeGenderRepository;
    private EmployeeGender employeeGender;

    //private EmployeeRepository employeeRepository;
    //private Employee employee;

    /*private EmployeeController employeeController;

    private EmployeeRepository employeeRepository;
    private Employee employee;

    private GenderRepository genderRepository;
    private Gender gender;

    private RaceRepository raceRepository;
    private Race race;

    private EmployeeRaceRepository employeeRaceRepository;
    private EmployeeRace employeeRace;

    private EmployeeGenderRepository employeeGenderRepository;
    private EmployeeGender employeeGender;

    //private EmployeeRepository employeeRepository;
    //private Employee employee;

    private Employee getSavedEmployee(){
        Set<Employee> savedEmployee = this.employeeRepository.getAll();
        return savedEmployee.iterator().next();
    }

    private Gender getSavedGender(){
        Set<Gender> savedGender = this.genderRepository.getAll();
        return savedGender.iterator().next();
    }

    private Race getSavedRace(){
        Set<Race> savedRace = this.raceRepository.getAll();
        return savedRace.iterator().next();
    }

    private EmployeeRace getSavedEmployeeRace(){
        Set<EmployeeRace> savedEmployeeRace = this.employeeRaceRepository.getAll();
        return savedEmployeeRace.iterator().next();
    }

    private EmployeeGender getSavedEmployeeGender(){
        Set<EmployeeGender> savedEmployeeGender = this.employeeGenderRepository.getAll();
        return savedEmployeeGender.iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.employeeRepository = EmployeeRepositoryImpl.getRepository();
        this.genderRepository = GenderRepositoryImpl.getRepository();
        this.raceRepository = RaceRepositoryImpl.getRepository();
        this.employeeRaceRepository = EmployeeRaceRepositoryImpl.getRepository();
        this.employeeGenderRepository = EmployeeGenderRepositoryImpl.getRepository();
        employeeController = new EmployeeController();
    }

    @Test
    public void create() {
        Employee employee = EmployeeFactory.buildEmployee("Mikhail", "Hathey");
        Race race = RaceFactory.buildRace("Indian");
        Gender gender = GenderFactory.buildGender("Male");

        employeeController.create(employee);
        employeeController.create(race);
        employeeController.create(gender);

        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace(getSavedEmployee().getEmployeeNumber(),getSavedRace().getId());
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(getSavedEmployee().getEmployeeNumber(),getSavedGender().getId());

        employeeController.create(employeeRace);
        employeeController.create(employeeGender);

        System.out.println(getSavedEmployee().getEmployeeNumber());
        System.out.println(getSavedEmployee().getEmployeeFirstName());
        Assert.assertEquals(1, this.employeeRepository.getAll().size());

        Assert.assertEquals("Mikhail", getSavedEmployee().getEmployeeFirstName());
        Assert.assertEquals("Indian", getSavedRace().getDescription());
        Assert.assertEquals("Male", getSavedGender().getDescription());
        Assert.assertNotEquals(getSavedEmployee().getEmployeeNumber(), getSavedEmployeeGender().getEmployeeNumber());
        Assert.assertNotEquals(getSavedRace().getId(), getSavedEmployeeRace().getRaceId());

        System.out.println(getSavedRace().getDescription());
        System.out.println(getSavedGender().getDescription());
        System.out.println();

    }

    private EmployeeController employeeController;


    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }*/




    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }

    @Test
    public void create() {

        Gender gender = GenderFactory.buildGender("Male");
        Race race = RaceFactory.buildRace("Indian");
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("123", "123");
        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("123", "123");
        Employee employee = EmployeeFactory.buildEmployee("Mikhail", "Hathey");

        //employeeController.create(employee.getEmployeeNumber(), employee.getEmployeeFirstName() ,employee.getEmployeeLastName(), gender.getId(),race.getId());

        employeeController.create("Mikhail", "Hathey", 123, 456);

        Assert.assertNotNull(employee);
        System.out.println(employee);

        Assert.assertNotNull(employeeGender);
        System.out.println(employeeGender);

        Assert.assertNotNull(employeeRace);
        System.out.println(employeeRace);

        Assert.assertNotNull(gender);
        System.out.println(gender);

        Assert.assertNotNull(race);
        System.out.println(race);
    }
}