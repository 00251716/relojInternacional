package com.naldana.miprimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextClock textClockMain = (TextClock) findViewById(R.id.text_hora_principal);
        textClockMain.setTimeZone("America/Tegucigalpa");

        TextClock textClock1 = (TextClock) findViewById(R.id.textClock1);
        textClock1.setTimeZone("Europe/London");

        TextClock textClock2 = (TextClock) findViewById(R.id.textClock2);
        textClock2.setTimeZone("CST6CDT");

        TextClock textClock3 = (TextClock) findViewById(R.id.textClock3);
        textClock3.setTimeZone("America/New_York");

    }
}
