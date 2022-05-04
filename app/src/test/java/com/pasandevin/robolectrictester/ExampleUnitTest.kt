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
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun check_main_activity() {
        val activity: MainActivity = Robolectric.setupActivity(MainActivity::class.java)
        val textView : TextView = activity.findViewById<TextView>(R.id.textView)
        assertEquals("Hello World!", textView.text)
    }





}