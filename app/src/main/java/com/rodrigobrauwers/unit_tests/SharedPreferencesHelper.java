package com.rodrigobrauwers.unit_tests;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by rodrigobrauwers on 28/11/17.
 */

public class SharedPreferencesHelper {

    private SharedPreferences sharedPreferences;

    public SharedPreferencesHelper(UnitTestsApplication applicationContext) {
        sharedPreferences = applicationContext.getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE);
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }
}
