package com.pattersonhs.jchen.myapplication;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlarmManager;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    EditText wakeUpTimeEdit;
    EditText travelTimeEdit;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wakeUpTimeEdit = (EditText) findViewById(R.id.wakeUpTime);
        travelTimeEdit = (EditText) findViewById(R.id.travelTime);
        submitButton = (Button) findViewById(R.id.submitButton);

        //int time = parseInt(wakeUpTimeEdit.getText().toString());

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                    //intent.putExtra(AlarmClock.EXTRA_MESSAGE,"NEW ALARM");
                    //intent.putExtra(AlarmClock.EXTRA_HOUR,10);
                    //intent.putExtra(AlarmClock.EXTRA_MINUTES,45);
                //if (intent .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                //}
            }
        });
    }

}