package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button StartBtn , LoginBtn , LoginBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginBtn = (Button) findViewById(R.id.LoginBtn);
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this , Menu.class);
                startActivity(intent);
            }
        });

        LoginBtn2 = (Button) findViewById(R.id.LoginBtn2);
        LoginBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this , Menu.class);
                startActivity(intent);
            }
        });
    }
}
