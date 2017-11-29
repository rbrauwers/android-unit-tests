package com.rodrigobrauwers.unit_tests;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class FlowOneStepOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);

        setContentView(R.layout.activity_flow_one_step_one);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button2)
    public void buttonClick() {
        startActivity(new Intent(getApplicationContext(), FlowOneStepTwoActivity.class));
    }

}
