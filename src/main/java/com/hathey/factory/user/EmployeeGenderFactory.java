package com.hathey.factory.user;

import com.hathey.domain.user.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String empId,String genderId){
        return new EmployeeGender(empId, genderId);
    }
}
