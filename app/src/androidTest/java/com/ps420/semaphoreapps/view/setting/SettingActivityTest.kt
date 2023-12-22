package com.ps420.semaphoreapps.view.setting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.ps420.semaphoreapps.R

//@RunWith(AndroidJUnit4::class)
//class SettingActivityTest{
//    @get:Rule
//    val activity = ActivityScenarioRule(SettingActivity::class.java)
//
//    @Test
//    fun testDayTheme() {
//        Intents.init()
//        onView(withId(R.id.btnSwitchTheme)).perform(click())
//        onView(withId(R.id.btnSwitchTheme)).perform(click())
//    }
//}