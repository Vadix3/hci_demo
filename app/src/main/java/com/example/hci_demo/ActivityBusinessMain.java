package com.example.hci_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;


/**
 * businessMain_Btn_Messages
 * businessMain_Btn_updateDetails
 * businessMain_Btn_businessStats
 */
public class ActivityBusinessMain extends AppCompatActivity {

    private MaterialButton messages;
    private MaterialButton details;
    private MaterialButton stats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_main);

        messages = findViewById(R.id.businessMain_Btn_Messages);
        details = findViewById(R.id.businessMain_Btn_updateDetails);
        stats = findViewById(R.id.businessMain_Btn_businessStats);


        messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityBusinessMain.this, ActivityMessages.class));
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityBusinessMain.this, ActivityAddBusinessDetails.class));
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityBusinessMain.this, ActivityBusinessStats.class));
            }
        });
    }
}