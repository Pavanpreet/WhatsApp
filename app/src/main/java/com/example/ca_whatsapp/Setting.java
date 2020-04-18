package com.example.ca_whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Setting extends AppCompatActivity {

    private Button update;
    private EditText Name,status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_setting);
        Name = findViewById(R.id.user_Name);
        status = findViewById(R.id.user_status);
        update = findViewById(R.id.user_Button);

    }
}
