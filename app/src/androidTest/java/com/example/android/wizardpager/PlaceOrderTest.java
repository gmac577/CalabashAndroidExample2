package com.example.android.wizardpager;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class PlaceOrderTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void placeOrderTest() {
        ViewInteraction checkedTextView = onView(
                allOf(withId(android.R.id.text1), withText("Sandwich"),
                        childAtPosition(
                                withId(android.R.id.list),
                                0),
                        isDisplayed()));
        checkedTextView.perform(click());

        ViewInteraction checkedTextView2 = onView(
                allOf(withId(android.R.id.text1), withText("Sandwich"),
                        childAtPosition(
                                withId(android.R.id.list),
                                0),
                        isDisplayed()));
        checkedTextView2.perform(click());

        ViewInteraction button = onView(
                allOf(withId(R.id.next_button), withText("Next"), isDisplayed()));
        button.perform(click());

        ViewInteraction checkedTextView3 = onView(
                allOf(withId(android.R.id.text1), withText("White"),
                        childAtPosition(
                                withId(android.R.id.list),
                                0),
                        isDisplayed()));
        checkedTextView3.perform(click());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.next_button), withText("Next"), isDisplayed()));
        button2.perform(click());

        ViewInteraction checkedTextView4 = onView(
                allOf(withId(android.R.id.text1), withText("Turkey"),
                        childAtPosition(
                                withId(android.R.id.list),
                                1),
                        isDisplayed()));
        checkedTextView4.perform(click());

        ViewInteraction checkedTextView5 = onView(
                allOf(withId(android.R.id.text1), withText("Ham"),
                        childAtPosition(
                                withId(android.R.id.list),
                                2),
                        isDisplayed()));
        checkedTextView5.perform(click());

        ViewInteraction button3 = onView(
                allOf(withId(R.id.next_button), withText("Next"), isDisplayed()));
        button3.perform(click());

        ViewInteraction checkedTextView6 = onView(
                allOf(withId(android.R.id.text1), withText("Lettuce"),
                        childAtPosition(
                                withId(android.R.id.list),
                                1),
                        isDisplayed()));
        checkedTextView6.perform(click());

        ViewInteraction checkedTextView7 = onView(
                allOf(withId(android.R.id.text1), withText("Cucumbers"),
                        childAtPosition(
                                withId(android.R.id.list),
                                4),
                        isDisplayed()));
        checkedTextView7.perform(click());

        ViewInteraction button4 = onView(
                allOf(withId(R.id.next_button), withText("Next"), isDisplayed()));
        button4.perform(click());

        ViewInteraction checkedTextView8 = onView(
                allOf(withId(android.R.id.text1), withText("Swiss"),
                        childAtPosition(
                                withId(android.R.id.list),
                                0),
                        isDisplayed()));
        checkedTextView8.perform(click());

        ViewInteraction checkedTextView9 = onView(
                allOf(withId(android.R.id.text1), withText("Provolone"),
                        childAtPosition(
                                withId(android.R.id.list),
                                4),
                        isDisplayed()));
        checkedTextView9.perform(click());

        ViewInteraction button5 = onView(
                allOf(withId(R.id.next_button), withText("Next"), isDisplayed()));
        button5.perform(click());

        ViewInteraction checkedTextView10 = onView(
                allOf(withId(android.R.id.text1), withText("Yes"),
                        childAtPosition(
                                withId(android.R.id.list),
                                0),
                        isDisplayed()));
        checkedTextView10.perform(click());

        ViewInteraction button6 = onView(
                allOf(withId(R.id.next_button), withText("Next"), isDisplayed()));
        button6.perform(click());

        ViewInteraction checkedTextView11 = onView(
                allOf(withId(android.R.id.text1), withText("30 seconds"),
                        childAtPosition(
                                withId(android.R.id.list),
                                0),
                        isDisplayed()));
        checkedTextView11.perform(click());

        ViewInteraction button7 = onView(
                allOf(withId(R.id.next_button), withText("Next"), isDisplayed()));
        button7.perform(click());

        ViewInteraction editText = onView(
                withId(R.id.your_name));
        editText.perform(scrollTo(), replaceText("Bryce Lynch"), closeSoftKeyboard());

        ViewInteraction editText2 = onView(
                withId(R.id.your_email));
        editText2.perform(scrollTo(), replaceText("blynch@example.com"), closeSoftKeyboard());

        ViewInteraction button8 = onView(
                allOf(withId(R.id.next_button), withText("Next"), isDisplayed()));
        button8.perform(click());

        ViewInteraction button9 = onView(
                allOf(withId(R.id.next_button), withText("Submit order"), isDisplayed()));
        button9.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(android.R.id.message), withText("Place the order with the deli? You will receive an email confirmation."),
                        childAtPosition(
                                allOf(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                0)),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("Place the order with the deli? You will receive an email confirmation.")));

        ViewInteraction button10 = onView(
                allOf(withId(android.R.id.button1), withText("Place order"), isDisplayed()));
        button10.perform(click());

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
