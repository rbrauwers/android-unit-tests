package com.rodrigobrauwers.unit_tests;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by rbrauwers on 25/10/16.
 */

public class UnitTestsApplication extends DaggerApplication {

    protected AndroidInjector<UnitTestsApplication> appInjector;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return appInjector;
    }

    @Override
    public void onCreate() {
        appInjector = DaggerAppComponent.builder().create(this);
        appInjector.inject(this);
        super.onCreate();
    }
}
