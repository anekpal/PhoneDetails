package com.example.acer3.phonedetails.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by acer3 on 12/5/2017.
 */

public class PhoneStateBroadcastReceiver extends BroadcastReceiver {

    private final String LOG_TAG = "CallStateReceiver";

    public static String lastState = TelephonyManager.EXTRA_STATE_IDLE;
    public static String prevState=TelephonyManager.EXTRA_STATE;

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle = intent.getExtras();
        if (bundle == null) {
            return;
        }
        String number = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        Log.e("outgoing call number",""+number);
        String state = bundle.getString(TelephonyManager.EXTRA_STATE);
        if (state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_IDLE)
                && !lastState.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_IDLE)) {
            String time= SimpleDateFormat.getDateTimeInstance().format(new Date());
                   // CallActivity.insertUpdateHistory(time);
            Log.e(this.LOG_TAG, "Call ended"+time);
        }
        lastState = state;
    }

}