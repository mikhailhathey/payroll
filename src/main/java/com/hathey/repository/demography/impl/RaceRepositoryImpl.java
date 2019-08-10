package com.hathey.repository.demography.impl;

import com.hathey.domain.demography.Race;
import com.hathey.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {

    private static RaceRepository raceRepository = null;

    private Set<Race> races;


    private RaceRepositoryImpl(){
        this.races = new HashSet<>();
    }

    public static RaceRepository getRepository(){
        if (raceRepository == null) raceRepository = new RaceRepositoryImpl();
        return raceRepository;
    }

    @Override
    public Race create(Race race) {
        this.races.add(race);
        return race;
    }

    @Override
    public Race update(Race race) {
        Race updatedRace = null;
        Race e = read(race.getId());
        if (e != null){
            delete(race.getId());
            this.races.add(race);
            updatedRace = race;
        }
        return updatedRace;
    }

    @Override
    public Race delete(String s) {
        Race e = read(s);
        if (e != null) {
            this.races.remove(e);
        }
        return e;
    }

    @Override
    public Race read(final String s) {
        return this.races.stream().filter(e -> e.getId().equals(s)).findAny().orElse(null);
    }

    @Override
    public Set<Race> getAll() {
        return this.races;
    }
}
