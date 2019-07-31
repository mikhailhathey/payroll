package com.hathey.factory.demography;

import com.hathey.domain.demography.Race;
import com.hathey.util.Misc;

public class RaceFactory {

    public static Race buildRace(String race){
        return new Race.Builder()
                .id(Misc.generateId())
                .description(race)
                .build();
    }

}
