package com.hathey.service.user;

import com.hathey.domain.user.EmployeeRace;
import com.hathey.factory.user.EmployeeRaceFactory;
import com.hathey.repository.user.EmployeeRaceRepository;
import com.hathey.repository.user.impl.EmployeeRaceRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRaceServiceTest {
    private EmployeeRaceRepository repository;
    private EmployeeRace employeeRace;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRaceRepositoryImpl.getRepository();
        this.employeeRace = EmployeeRaceFactory.buildEmployeeRace("Mikhail", "Hathey");
    }


    @Test
    public void getAll(){
        Set<EmployeeRace> employeeRace = this.repository.getAll();
        System.out.println("In getall, all = " + employeeRace);
    }

}