package com.rodrigobrauwers.unit_tests;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;

/**
 * Created by rodrigobrauwers on 29/11/17.
 */

@Module
public abstract class MainActivityModule {

    @Binds
    @DIAnnotations.PerActivity
    abstract Activity activity(MainActivity activity);

}
