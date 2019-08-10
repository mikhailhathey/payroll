package com.hathey.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IndexControllerTest {

    private IndexController indexController;

    @Before
    public void setUp() throws Exception {
        indexController = new IndexController();
    }

    @Test
    public void getHome() {
        Assert.assertNotNull("Welcome to Payroll Application");
    }

}