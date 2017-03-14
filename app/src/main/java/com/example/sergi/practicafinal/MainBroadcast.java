package com.example.sergi.practicafinal;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainBroadcast extends Practica {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainbroadcast);

        final Button btnreadbattery = (Button) findViewById(R.id.textBatteryStatus);


        btnreadbattery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnreadbattery.setText(readBattery());

            }
        });
    }

    private String readBattery() {

        StringBuilder sb = new StringBuilder();
        IntentFilter batteryIntentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryIntent = registerReceiver(null, batteryIntentFilter);

        boolean present1 = batteryIntent.getExtras().getBoolean(BatteryManager.EXTRA_PRESENT);
        sb.append("PRESENT" + present1 + "\n");

        int status = 0;

        if (status == BatteryManager.BATTERY_STATUS_CHARGING) {
            sb.append("BATTERY_STATUS_CHARGING\n");
        }
        if (status == BatteryManager.BATTERY_STATUS_FULL) {
            sb.append("BATTERY_STATUS_FULL\n");
        }

        int plugged = batteryIntent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
        if (plugged == BatteryManager.BATTERY_PLUGGED_USB) {
            sb.append("BATTERY_PLUGGED_USB\n");
        }
        if (plugged == BatteryManager.BATTERY_PLUGGED_AC) {
            sb.append("BATTERY_PLUGGED_AC\n");
        }

        int level = batteryIntent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        sb.append("LEVEL :" + level + "\n");

        int scale = batteryIntent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
        sb.append("SCALE :" + scale + "\n");

        String technology = batteryIntent.getExtras().getString(BatteryManager.EXTRA_TECHNOLOGY);
        sb.append("TECHNOLOGY :" + technology + "\n");

        int temperature = batteryIntent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, -1);
        sb.append("TEMPERATURE :" + temperature + "\n");

        int voltage = batteryIntent.getIntExtra(BatteryManager.EXTRA_VOLTAGE, -1);
        sb.append("VOLTAGE :" + voltage + "\n");


        return sb.toString();


    }

}