package com.example.brdemo

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var receiver:BroadcastReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        receiver = NewBR()
//        IntentFilter(Telephony.Sms.Intents.SMS_RECEIVED_ACTION).also {
//            registerReceiver(receiver, it)
//        }
    }

    fun getMessage(msg: Intent){
        findViewById<TextView>(R.id.textView).text = msg.dataString

    }
}