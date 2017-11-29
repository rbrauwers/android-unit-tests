package com.rodrigobrauwers.unit_tests;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

/**
 * Created by rodrigobrauwers on 24/10/17.
 * Provides application-wide dependencies.
 */
//@Module(includes = AndroidInjectionModule.class)
@Module
public abstract class AppModule {

    @Binds
    @Singleton
    /*
     * Singleton annotation isn't necessary since Application instance is unique but is here for
     * convention. In general, providing Activity, Fragment, BroadcastReceiver, etc does not require
     * them to be scoped since they are the components being injected and their instance is unique.
     *
     * However, having a scope annotation makes the module easier to read. We wouldn't have to look
     * at what is being provided in order to understand its scope.
     */
    //abstract UnitTestsApplication application(UnitTestsApplication app);
    abstract Application application(UnitTestsApplication app);
}
