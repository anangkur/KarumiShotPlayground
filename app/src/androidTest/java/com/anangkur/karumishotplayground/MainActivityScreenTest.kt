package com.anangkur.karumishotplayground

import android.util.Log
import com.karumi.shot.ScreenshotTest
import org.junit.Rule
import org.junit.Test
import androidx.test.ext.junit.rules.activityScenarioRule

class MainActivityScreenTest : ScreenshotTest {
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun activityTest() {
        val activity = launchActivity()

        compareScreenshot(activity)
    }

    // Hack needed until we fully support Activity Scenarios
    private fun launchActivity(): MainActivity {
        var activity: MainActivity? = null
        activityScenarioRule.scenario.onActivity {
            activity = it
        }
        while (activity == null) {
            Log.d("MainActivityTest", "Waiting for activity to be initialized")
        }
        return activity!!
    }
}