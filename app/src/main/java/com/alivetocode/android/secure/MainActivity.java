package com.alivetocode.android.secure;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Added temporary button
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openLoginOptions();
            }
        });
    }
    //Function for going to next activity
    public void openLoginOptions() {
        Intent intent = new Intent(this, LoginOptions.class);
        startActivity(intent);
    }
}