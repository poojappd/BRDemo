package com.example.brdemo

import android.content.BroadcastReceiver
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony
import android.provider.Telephony.Sms.Intents.getMessagesFromIntent
import android.telephony.SmsMessage
import android.util.Log
import android.widget.Toast

class NewBR :BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.e(TAG, "reached")
        val intentExtras = intent?.extras

        //toast appears even if app is closed, when intent filter is declared in manifest
        Toast.makeText(context, "Received msg from $context", Toast.LENGTH_SHORT).show()
        if (intent?.action == Telephony.Sms.Intents.SMS_RECEIVED_ACTION) {
            Log.e(TAG, "Received sms")
            val extractMessages = Telephony.Sms.Intents.getMessagesFromIntent(intent)
            extractMessages.forEach { smsMessage -> Log.v(TAG, smsMessage.displayMessageBody) }

        } else
            Log.e(TAG, "Didn't receive sms")


    }
}