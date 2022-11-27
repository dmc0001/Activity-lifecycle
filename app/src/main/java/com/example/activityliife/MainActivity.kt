package com.example.activityliife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG,"onCreate")
        addCallBacks()

    }
    private fun addCallBacks (){
        button.setOnClickListener {
            val i = Intent(this,MainActivity2::class.java)
            startActivity(i)
            Toast.makeText(this,"Activity two", Toast.LENGTH_SHORT).show()
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
        const val LOG_TAG = "FIRST_ACTIVITY"
    }
}