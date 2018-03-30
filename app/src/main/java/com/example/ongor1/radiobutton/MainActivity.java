package com.example.ongor1.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton = (RadioButton) findViewById(i);
                switch (radioButton.getId()) {
                    case R.id.YesID: {
                        if (radioButton.isChecked()) {
                            Log.d("RD", "Yes");
                        }
                        Toast.makeText(getApplicationContext(), "You choose Yes!", Toast.LENGTH_LONG).show();
                    }
                    break;
                    case R.id.MaybeID: {
                        if (radioButton.isChecked()) {
                            Log.d("RD", "Maybe");
                        }
                        Toast.makeText(getApplicationContext(), "You choose Maybe!", Toast.LENGTH_LONG).show();
                    }
                    break;
                    case R.id.NoID: {
                        if (radioButton.isChecked()) {
                            Log.d("RD", "No");
                        }
                        Toast.makeText(getApplicationContext(), "You choose No!", Toast.LENGTH_LONG).show();
                    }
                    break;
                }
            }

        });
    }
}
