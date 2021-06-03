package com.alivetocode.android.secure;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginOptions extends AppCompatActivity {

    private Button student_login;
    private Button teacher_login;
    private Button lnmcbm_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_options);

        //Added temporary buttons
        student_login = findViewById(R.id.button2);
        student_login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openStudentLogin();
            }
        });
        teacher_login = findViewById(R.id.button3);
        teacher_login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openTeacherLogin();
            }
        });
        lnmcbm_login = findViewById(R.id.button4);
        lnmcbm_login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openLnmcbmLogin();
            }
        });
    }
    //Function for going to student_login activity
    public void openStudentLogin() {
        Intent intent = new Intent(this, StudentLogin.class);
        startActivity(intent);
    }
    //Function for going to teacher_login activity
    public void openTeacherLogin() {
        Intent intent = new Intent(this, TeacherLogin.class);
        startActivity(intent);
    }
    //Function for going to lnmcbm_login activity
    public void openLnmcbmLogin() {
        Intent intent = new Intent(this, lnmcbm_otp_login.class);
        startActivity(intent);
    }

}