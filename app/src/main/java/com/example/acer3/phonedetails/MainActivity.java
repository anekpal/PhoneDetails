package com.example.acer3.phonedetails;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

import com.example.acer3.phonedetails.utils.CallStateListener;

public class MainActivity extends AppCompatActivity {
    TelephonyManager tm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CallStateListener callStateListener=new CallStateListener();
        tm = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
        tm.listen(callStateListener, PhoneStateListener.LISTEN_CALL_STATE);
        createFolder();
    }

    private void createFolder()
    {

    }
}
