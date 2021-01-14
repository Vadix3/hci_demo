package com.example.hci_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;


public class ActivityAddBusinessDetails extends AppCompatActivity {

    private MaterialButton scan_qr;
    private MaterialButton submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_add_business_details);

        scan_qr = findViewById(R.id.updatebis_btn_updateQR);
        scan_qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityAddBusinessDetails.this, ActivityScanQR.class));
            }
        });


        submit = findViewById(R.id.updatebis_EDT_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityAddBusinessDetails.this, ActivityBusinessMain.class));
            }
        });
    }
}
