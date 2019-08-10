package com.hathey.repository.demography.impl;

import com.hathey.domain.demography.Gender;
import com.hathey.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepository genderRepository = null;

    private Set<Gender> genders;


    private GenderRepositoryImpl(){
        this.genders = new HashSet<>();
    }

    public static GenderRepository getRepository(){
        if (genderRepository == null) genderRepository = new GenderRepositoryImpl();
        return genderRepository;
    }

    @Override
    public Gender create(Gender gender) {
        this.genders.add(gender);
        return gender;
    }

    @Override
    public Gender update(Gender gender) {
        Gender updatedGender = null;
        Gender e = read(gender.getId());
        if (e != null){
            delete(gender.getId());
            this.genders.add(gender);
            updatedGender = gender;
        }
        return updatedGender;
    }

    @Override
    public Gender delete(String s) {
        Gender e = read(s);
        if (e != null) {
            this.genders.remove(e);
        }
        return e;
    }

    @Override
    public Gender read(final String s) {
        return this.genders.stream().filter(e -> e.getId().equals(s)).findAny().orElse(null);
    }

    @Override
    public Set<Gender> getAll() {
        return this.genders;
    }
}
