package com.hathey.factory.demography;

import com.hathey.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender gender = GenderFactory.buildGender("Male");
        Assert.assertEquals("Male", gender.getDescription());
        Assert.assertNotNull(gender.getId());
        System.out.println(gender.getId());
        Assert.assertNotNull(gender);
    }
}