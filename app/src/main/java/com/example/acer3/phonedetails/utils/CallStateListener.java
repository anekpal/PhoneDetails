package com.example.acer3.phonedetails.utils;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by acer3 on 12/17/2017.
 */

public class CallStateListener extends  PhoneStateListener
{
    @Override
    public void onCallStateChanged(int state, String incomingNumber) {
        switch (state) {
            case TelephonyManager.CALL_STATE_RINGING:
                // called when someone is ringing to this phone
                Log.e("incoming call number",""+incomingNumber);
                break;

        }
    }
}
