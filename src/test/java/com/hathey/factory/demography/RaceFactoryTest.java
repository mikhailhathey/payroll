package com.hathey.factory.demography;

import com.hathey.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace("Indian");
        Assert.assertEquals("Indian", race.getDescription());
        Assert.assertNotNull(race.getId());
        System.out.println(race.getId());
        Assert.assertNotNull(race);
    }
}