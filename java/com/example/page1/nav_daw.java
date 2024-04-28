package com.example.page1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class nav_daw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        ImageView navDraw = findViewById(R.id.nav_draw);


        navDraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer();
            }
        });
    }

    private void openDrawer() {
        DrawerLayout drawerLayout = findViewById(R.id.drawerlayout);
        drawerLayout.openDrawer(GravityCompat.END);
    }
}
