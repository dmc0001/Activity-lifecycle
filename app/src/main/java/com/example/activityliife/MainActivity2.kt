package com.example.activityliife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d( LOG_TAG,"onCreate")
        button_two.setOnClickListener {
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d( LOG_TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d( LOG_TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d( LOG_TAG,"onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d( LOG_TAG,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d( LOG_TAG,"onDestroy")
    }
    companion object{
        const val LOG_TAG = "SECOND_ACTIVITY"
    }
}