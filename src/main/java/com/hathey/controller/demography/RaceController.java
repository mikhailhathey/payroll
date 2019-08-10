package com.hathey.controller.demography;

import com.hathey.domain.demography.Race;
import com.hathey.service.demography.RaceService;

public class RaceController {
    private RaceService service;

    public Race create(Race race){
        return service.create(race);
    }

    public Race update(Race race){
        return service.update(race);
    }

    public Race delete(String s){
        return service.delete(s);
    }

    public Race read(String s){
        return service.read(s);
    }
}
