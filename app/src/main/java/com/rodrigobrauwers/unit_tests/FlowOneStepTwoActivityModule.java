package com.rodrigobrauwers.unit_tests;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;

/**
 * Created by rodrigobrauwers on 29/11/17.
 */

@Module
public abstract class FlowOneStepTwoActivityModule {

    @Binds
    @DIAnnotations.PerActivity
    abstract Activity activity(FlowOneStepTwoActivity activity);

}
