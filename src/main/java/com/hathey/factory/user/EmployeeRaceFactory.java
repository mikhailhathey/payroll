package com.hathey.factory.user;

import com.hathey.domain.user.EmployeeRace;
import com.hathey.util.Misc;

public class EmployeeRaceFactory {
    public static EmployeeRace buildEmployeeRace(String employeeNumber, String raceId){
        return new EmployeeRace.Builder()
                .employeeNumber(Misc.generateId())
                .raceId()
                .build();
    }
}
