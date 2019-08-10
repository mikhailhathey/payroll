package com.hathey.service.demography;

import com.hathey.domain.demography.Race;
import com.hathey.factory.demography.RaceFactory;
import com.hathey.repository.demography.RaceRepository;
import com.hathey.repository.demography.impl.RaceRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceTest {
    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.buildRace("Indian");
    }


    @Test
    public void getAll(){
        Set<Race> race = this.repository.getAll();
        System.out.println("In getall, all = " + race);
    }
}