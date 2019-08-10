package com.hathey.service.demography.impl;

import com.hathey.domain.demography.Gender;
import com.hathey.repository.demography.GenderRepository;
import com.hathey.repository.demography.impl.GenderRepositoryImpl;
import com.hathey.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {
    private static GenderService service = null;
    private GenderRepository genderRepository;

    private GenderServiceImpl(){
        this.genderRepository = GenderRepositoryImpl.getRepository();
    }

    public static GenderService getGenderService(){
        if (service == null) service = new GenderServiceImpl();
        return service;
    }

    @Override
    public Gender create(Gender gender) {
        return this.genderRepository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.genderRepository.update(gender);
    }

    @Override
    public Gender delete(String s) {
        return this.genderRepository.delete(s);
    }

    @Override
    public Gender read(String s) {
        return this.genderRepository.read(s);
    }

    /*@Override
    public Gender saveGender(String firstName, String lastName, String gender){
        Gender e = GenderFactory.buildGender(firstName, lastName);
        //get gender if exist

        create(e);
        return e;
    }*/

    @Override
    public Set<Gender> getAll() {
        Set<Gender> gender = this.genderRepository.getAll();
        System.out.println("In getall, all = " + gender);
        return gender;
    }

}
