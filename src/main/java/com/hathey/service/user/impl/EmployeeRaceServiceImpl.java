package com.hathey.service.user.impl;

import com.hathey.domain.user.EmployeeRace;
import com.hathey.repository.user.EmployeeRaceRepository;
import com.hathey.repository.user.impl.EmployeeRaceRepositoryImpl;
import com.hathey.service.user.EmployeeRaceService;

import java.util.Set;

public class EmployeeRaceServiceImpl implements EmployeeRaceService {

    private static EmployeeRaceService service = null;
    private EmployeeRaceRepository employeeRaceRepository;

    private EmployeeRaceServiceImpl(){
        this.employeeRaceRepository = EmployeeRaceRepositoryImpl.getRepository();
    }

    public static EmployeeRaceService getEmployeeRaceService(){
        if (service == null) service = new EmployeeRaceServiceImpl();
        return service;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        return this.employeeRaceRepository.create(employeeRace);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        return this.employeeRaceRepository.update(employeeRace);
    }

    @Override
    public EmployeeRace delete(String s) {
        return this.employeeRaceRepository.delete(s);
    }

    @Override
    public EmployeeRace read(String s) {
        return this.employeeRaceRepository.read(s);
    }

    /*@Override
    public EmployeeRace saveEmployeeRace(String firstName, String lastName, String race){
        EmployeeRace e = EmployeeRaceFactory.buildEmployeeRace(firstName, lastName);
        //get race if exist

        create(e);
        return e;
    }*/

    @Override
    public Set<EmployeeRace> getAll() {
        Set<EmployeeRace> employeeRace = this.employeeRaceRepository.getAll();
        System.out.println("In getall, all = " + employeeRace);
        return employeeRace;
    }
}
