package com.alivetocode.android.secure;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class college_otp_login extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.college_otp_login);

        //Creating temporary button
        button = findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openLnmcbmOtpVerification();
            }
        });
    }
    //Function for going into LnmcbmOtpVerification
    public void openLnmcbmOtpVerification() {
        Intent intent = new Intent(this, lnmcbm_otp_verification.class);
        startActivity(intent);
    }
}