package com.example.sergi.practicafinal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class PowerReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent){
        String action = intent.getAction();


        if(action == Intent.ACTION_BATTERY_LOW){
            Toast.makeText(context, "ACTION_BATTERY_LOW", Toast.LENGTH_LONG).show();

        }
        else if(action == Intent.ACTION_BATTERY_OKAY){
            Toast.makeText(context, "ACTION_BATTERY_OKAY", Toast.LENGTH_LONG).show();
        }
        else if(action == Intent.ACTION_POWER_CONNECTED){
            Toast.makeText(context, "ACTION_POWER_CONNECTED", Toast.LENGTH_LONG).show();
        }
        else if(action == Intent.ACTION_POWER_DISCONNECTED){
            Toast.makeText(context, "ACTION_POWER_DISCONNECTED", Toast.LENGTH_LONG).show();
        }

    }

}
