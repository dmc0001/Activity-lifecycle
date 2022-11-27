package com.example.activityliife

import android.content.Intent
import android.net.Uri
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
        addCallBacks()
    }
    private fun addCallBacks (){
        button_two.setOnClickListener {
            finish()
            Toast.makeText(this,"back", Toast.LENGTH_SHORT).show()
        }
        button_three.text = "call"
        button_three.setOnClickListener {
            //val i = Intent(Intent.ACTION_VIEW)
           // i.data = Uri.parse("https://google.com")
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:123456789")
            startActivity(i)

           // Toast.makeText(this,"Google", Toast.LENGTH_SHORT).show()
            Toast.makeText(this,"Phone Call", Toast.LENGTH_SHORT).show()
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