package com.example.page1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void loginbtn(View view) {
        Intent intent = new Intent(page2.this, page3.class);
        startActivity(intent);
    }

    public void regbtn(View view) {
        Intent intent = new Intent(page2.this, regact.class);
        startActivity(intent);
    }
}