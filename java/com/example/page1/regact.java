package com.example.page1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class regact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regact);
    }

    public void back2(View view) {
        Intent intent = new Intent(regact.this,page2.class);
        startActivity(intent);
    }

    public void regisbtn(View view) {
        Intent intent = new Intent(regact.this, homepage.class);
        startActivity(intent);
    }
}