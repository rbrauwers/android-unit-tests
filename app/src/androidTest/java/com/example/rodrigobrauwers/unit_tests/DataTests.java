package com.rodrigobrauwers.unit_tests;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.AndroidJUnitRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by rodrigobrauwers on 28/11/17.
 */

@RunWith(AndroidJUnit4.class)
public class DataTests {

    SharedPreferencesHelper sharedPreferencesHelper;
    DataRepository dataRepository;

    @Before
    public void init() {
        //sharedPreferencesHelper = new SharedPreferencesHelper(InstrumentationRegistry.getTargetContext());
        //dataRepository = new DataRepository(sharedPreferencesHelper);
    }

    @Test
    public void testUserNotExists() throws Exception {
        assertEquals(false, dataRepository.userExists());
    }

    @Test
    public void testUserExists() throws Exception {
        assertEquals(true, dataRepository.userExists());
    }

}
