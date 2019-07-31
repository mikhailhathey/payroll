package com.hathey.factory.demography;

import com.hathey.domain.demography.Gender;
import com.hathey.util.Misc;

public class GenderFactory {

    public static Gender buildGender(String gender){
        return new Gender.Builder()
                .id(Misc.generateId())
                .description(gender)
                .build();
    }
}
