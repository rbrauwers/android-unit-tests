package com.example.rodrigobrauwers.unit_tests;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

import com.rodrigobrauwers.unit_tests.UnitTestsApplication;

/**
 * Created by rodrigobrauwers on 29/11/17.
 */

public class CustomRunner extends AndroidJUnitRunner {

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, UnitTestsApplication.class.getName(), context);
    }

}
