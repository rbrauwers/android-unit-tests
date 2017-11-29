package com.rodrigobrauwers.unit_tests;

import android.content.Context;
import android.support.test.espresso.idling.CountingIdlingResource;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import javax.inject.Inject;

/**
 * Created by rodrigobrauwers on 28/11/17.
 */

public class DataRepository {

    private static final String TAG = "DataRepository";
    private SharedPreferencesHelper sharedPreferencesHelper;
    private String data;

    @Inject
    public DataRepository(UnitTestsApplication unitTestsApplication, SharedPreferencesHelper sharedPreferencesHelper) {
        this.sharedPreferencesHelper = sharedPreferencesHelper;
    }

    public String getData() {
        return data;
    }

    public void loadData() {
        EspressoIdlingResource.increment();
        FirebaseDatabase.getInstance().getReference().addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.d(TAG, String.format("onDataChange: %s", dataSnapshot));
                data = dataSnapshot.toString();
                EspressoIdlingResource.decrement();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public boolean userExists() {
        return sharedPreferencesHelper.getSharedPreferences().contains("user");
    }
}
