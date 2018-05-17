package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    Button HonbobBtn , DabobBtn , BoardBtn , MyPage;
    ImageButton Mypage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        HonbobBtn = (Button) findViewById(R.id.HonbobBtn);
        HonbobBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this , HonbobList.class);
                startActivity(intent);
            }
        });

        DabobBtn = (Button) findViewById(R.id.DabobBtn);
        DabobBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this , DabobList.class);
                startActivity(intent);
            }
        });

        BoardBtn = (Button) findViewById(R.id.BoardBtn);
        BoardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this , Board.class);
                startActivity(intent);
            }
        });

        Mypage = (ImageButton) findViewById(R.id.MyPage);
        Mypage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this , Mypage.class);
                startActivity(intent);

            }
        });
    }
}
