package com.rodrigobrauwers.unit_tests;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by rodrigobrauwers on 24/10/17.
 * Injects application dependencies.
 * Based on https://github.com/googlesamples/android-architecture/tree/todo-mvp-dagger/
 */
@Singleton
@Component(modules =
        {
                AppModule.class,
                SingletonsModule.class,
                ActivityBindingModule.class,
                AndroidSupportInjectionModule.class
        })
public interface AppComponent extends AndroidInjector<UnitTestsApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<UnitTestsApplication> {
    }

}
