package com.hathey.repository.user.impl;

import com.hathey.domain.user.EmployeeRace;
import com.hathey.repository.user.EmployeeRaceRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository {
    private static EmployeeRaceRepository repository = null;

    private Set<EmployeeRace> employeeRaces;


    private EmployeeRaceRepositoryImpl(){
        this.employeeRaces = new HashSet<>();
    }

    public static EmployeeRaceRepository getRepository(){
        if (repository == null) repository = new EmployeeRaceRepositoryImpl();
        return repository;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        this.employeeRaces.add(employeeRace);
        return employeeRace;
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        EmployeeRace updatedEmployee = null;
        //EmployeeRace em = new EmployeeRace.Builder().copy(employeeRace).employeeFirstName(); #Due to using SET this is not needed
        EmployeeRace e = read(employeeRace.getEmployeeNumber());
        if (e != null){
            delete(employeeRace.getEmployeeNumber());
            this.employeeRaces.add(employeeRace);
            updatedEmployee = employeeRace;
        }
        return updatedEmployee;
    }

    @Override
    public EmployeeRace delete(String s) {
        EmployeeRace e = read(s);
        if (e != null) {
            this.employeeRaces.remove(e);
        }
        return e;
    }

    @Override
    public EmployeeRace read(final String s) {
        return this.employeeRaces.stream().filter(e -> e.getEmployeeNumber().equals(s)).findAny().orElse(null);
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return this.employeeRaces;
    }
}
