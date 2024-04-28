package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    public void back1(View view) {
        Intent intent = new Intent(page3.this, page2.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent login = new Intent(page3.this, homepage.class);
        startActivity(login);
    }
}