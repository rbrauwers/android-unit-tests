package com.rodrigobrauwers.unit_tests;

import android.support.test.espresso.Espresso;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.google.android.libraries.cloudtesting.screenshots.ScreenShotter;
import com.rodrigobrauwers.unit_tests.MainActivity;
import com.rodrigobrauwers.unit_tests.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by rodrigobrauwers on 28/11/17.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class FlowOneTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);


    @Before
    public void registerIdlingResource() {
        Espresso.registerIdlingResources(
                mActivityRule.getActivity().getCountingIdlingResource());
    }


    @Test
    public void flowOneStepOne() {
        buttonClick(R.id.button);
        buttonClick(R.id.button2);

        try {
            Thread.sleep(4000);
            ScreenShotter.takeScreenshot("FlowOneTestStepTwo", mActivityRule.getActivity());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void buttonClick(int id) {
        onView(withId(id)).perform(click());
    }

}
