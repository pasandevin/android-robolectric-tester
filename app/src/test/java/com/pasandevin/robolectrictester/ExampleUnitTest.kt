package com.pasandevin.robolectrictester


import android.content.Intent
import android.widget.TextView
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
class ExampleUnitTest {


    @Test
    fun check_main_activity() {
        val activity = Robolectric.buildActivity(MainActivity::class.java).create().get()
        val textView : TextView = activity.findViewById<TextView>(R.id.textView)
        assertEquals("Hello World!", textView.text)
    }





}