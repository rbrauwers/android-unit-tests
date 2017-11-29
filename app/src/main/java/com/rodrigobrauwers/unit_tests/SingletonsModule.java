package com.rodrigobrauwers.unit_tests;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rodrigobrauwers on 30/10/17.
 */

@Module
public class SingletonsModule {

    @Provides
    @Singleton
    public SharedPreferencesHelper provideSharedPreferencesHelper(UnitTestsApplication context) {
        return new SharedPreferencesHelper(context);
    }

    @Provides
    @Singleton
    public DataRepository provideDataRepository(UnitTestsApplication context, SharedPreferencesHelper sharedPreferencesHelper) {
        return new DataRepository(context, sharedPreferencesHelper);
    }

}