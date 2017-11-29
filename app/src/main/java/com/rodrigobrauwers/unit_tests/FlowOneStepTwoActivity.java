package com.rodrigobrauwers.unit_tests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class FlowOneStepTwoActivity extends AppCompatActivity {

    @BindView(R.id.dataTextView) TextView dataTextView;

    @Inject protected DataRepository dataRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);

        setContentView(R.layout.activity_flow_one_step_two);
        ButterKnife.bind(this);

        dataTextView.setText(dataRepository.getData());
    }
}
