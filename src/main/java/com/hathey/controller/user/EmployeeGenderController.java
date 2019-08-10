package com.hathey.controller.user;

import com.hathey.domain.user.EmployeeGender;
import com.hathey.service.user.EmployeeGenderService;

public class EmployeeGenderController {
    private EmployeeGenderService service;

    public EmployeeGender create(EmployeeGender employeeGender){
        return service.create(employeeGender);
    }

    public EmployeeGender update(EmployeeGender employeeGender){
        return service.update(employeeGender);
    }

    public EmployeeGender delete(String s){
        return service.delete(s);
    }

    public EmployeeGender read(String s){
        return service.read(s);
    }
}
