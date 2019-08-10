package com.hathey.factory.user;

import com.hathey.domain.user.EmployeeGender;
import com.hathey.util.Misc;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String employeeNumber,String genderId){
        return new EmployeeGender.Builder()
                .employeeNumber(Misc.generateId())
                .genderId()
                .build();
    }
}
