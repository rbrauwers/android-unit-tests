package com.rodrigobrauwers.unit_tests;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by rodrigobrauwers on 14/11/17.
 */
@Module
abstract public class ActivityBindingModule {

    @DIAnnotations.PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity getMainActivityInjector();

    @DIAnnotations.PerActivity
    @ContributesAndroidInjector(modules = FlowOneStepOneActivityModule.class)
    abstract FlowOneStepOneActivity getFlowOneStepOneActivityInjector();

    @DIAnnotations.PerActivity
    @ContributesAndroidInjector(modules = FlowOneStepTwoActivityModule.class)
    abstract FlowOneStepTwoActivity getFlowOneSteTwoActivityInjector();

}
