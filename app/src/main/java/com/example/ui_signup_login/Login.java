package com.example.ui_signup_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener((View v) -> {
            Intent intent = new Intent(getApplicationContext(), Signup.class);
            startActivity(intent);
        });
    }


}
