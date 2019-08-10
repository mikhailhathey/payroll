package com.hathey.service.user.impl;

import com.hathey.domain.user.EmployeeGender;
import com.hathey.repository.user.EmployeeGenderRepository;
import com.hathey.repository.user.impl.EmployeeGenderRepositoryImpl;
import com.hathey.service.user.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private static EmployeeGenderService service = null;
    private EmployeeGenderRepository employeeGenderRepository;

    private EmployeeGenderServiceImpl(){
        this.employeeGenderRepository = EmployeeGenderRepositoryImpl.getRepository();
    }

    public static EmployeeGenderService getEmployeeGenderService(){
        if (service == null) service = new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return this.employeeGenderRepository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return this.employeeGenderRepository.update(employeeGender);
    }

    @Override
    public EmployeeGender delete(String s) {
        return this.employeeGenderRepository.delete(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.employeeGenderRepository.read(s);
    }

    /*@Override
    public EmployeeGender saveEmployeeGender(String firstName, String lastName, String gender){
        EmployeeGender e = EmployeeGenderFactory.buildEmployeeGender(firstName, lastName);
        //get gender if exist

        create(e);
        return e;
    }*/

    @Override
    public void getAll() {
        Set<EmployeeGender> employeeGender = this.employeeGenderRepository.getAll();
        System.out.println("In getall, all = " + employeeGender);
    }
}
