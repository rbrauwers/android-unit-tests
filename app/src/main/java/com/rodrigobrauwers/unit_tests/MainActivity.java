package com.rodrigobrauwers.unit_tests;

import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.support.test.espresso.IdlingResource;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "test";

    @Inject DataRepository dataRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        dataRepository.loadData();
    }

    @OnClick(R.id.button)
    public void buttonClick() {
        startActivity(new Intent(getApplicationContext(), FlowOneStepOneActivity.class));
    }

    @OnClick(R.id.button2)
    public void buttonClick2() {

    }

    @VisibleForTesting
    public IdlingResource getCountingIdlingResource() {
        return EspressoIdlingResource.getIdlingResource();
    }
}
