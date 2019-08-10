package com.hathey.controller.demography;

import com.hathey.domain.demography.Gender;
import com.hathey.service.demography.GenderService;

public class GenderController {
    private GenderService service;

    public Gender create(Gender gender){
        return service.create(gender);
    }

    public Gender update(Gender gender){
        return service.update(gender);
    }

    public Gender delete(String s){
        return service.delete(s);
    }

    public Gender read(String s){
        return service.read(s);
    }
}
