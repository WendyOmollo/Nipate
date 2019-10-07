package com.wendyomollo.nipate;

import androidx.test.filters.LargeTest;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
@RunWith(AndroidJUnit4.class)
@LargeTest

public class MainActivityInstrumentation {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText(){
    onView(withId(R.id.editText)).perform(typeText("Kisumu"))
            .check(matches(withText("Kisumu")));
    }

    @Test
    public void locationIsSentToRestaurantsActivity() {
        String location = "Nairobi";
        onView(withId(R.id.editText)).perform(typeText(location),closeSoftKeyboard());
        try {                             // the sleep method requires to be checked and handled so we use try block
            Thread.sleep(250);
        } catch (InterruptedException e){
            System.out.println("got interrupted!");
        }
        onView(withId(R.id.buttonView)).perform(click());
        onView(withId(R.id.locationTextView)).check(matches
                (withText("In "+ location +" we have the following artists.Click on an artist for more details:")));
    }
}


