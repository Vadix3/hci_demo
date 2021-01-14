package com.example.hci_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class ActivityUserMain extends AppCompatActivity {

    private MaterialButton messages;
    private MaterialButton newMeeting;
    private MaterialButton scanQr;
    private MaterialButton updateStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);

        messages = findViewById(R.id.user_messages);
        newMeeting = findViewById(R.id.user_new_meeting);
        scanQr = findViewById(R.id.user_scan_qr);
        updateStatus = findViewById(R.id.user_status_update);

        messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityUserMain.this,ActivityMessages.class));
            }
        });
        newMeeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityUserMain.this,ActivityNewMeeting.class));
                scanQr.setEnabled(true);

            }
        });
        scanQr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityUserMain.this,ActivityScanQR.class));

            }
        });
        updateStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityUserMain.this,ActivityUpdateCovidStatus.class));
            }
        });

    }
}
