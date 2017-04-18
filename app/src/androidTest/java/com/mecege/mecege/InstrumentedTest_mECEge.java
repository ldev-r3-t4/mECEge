package com.mecege.mecege;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class InstrumentedTest_mECEge {
    private static final String SEND_STRING = "Sent a message and received 10 messages";
    private static final String LOAD_STRING = "Received 10 more messages";
    private static final String REFRESH_STRING = "Refreshed";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void send_test() {
        onView(withId(R.id.sendbutton)).perform(click());

        onView(withId(R.id.messageview)).check(matches(withText(SEND_STRING)));
    }

    @Test
    public void load_test() {
        onView(withId(R.id.loadbutton)).perform(click());

        onView(withId(R.id.messageview)).check(matches(withText(LOAD_STRING)));
    }

    @Test
    public void refresh_test() {
        onView(withId(R.id.refreshbutton)).perform(click());

        onView(withId(R.id.messageview)).check(matches(withText(REFRESH_STRING)));
    }
}



