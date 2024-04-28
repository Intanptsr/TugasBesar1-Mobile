package com.example.page1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        ImageView nav_daw = findViewById(R.id.nav_draw);

        nav_daw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer();
            }
        });
    }

    View nav_draw = findViewById(R.id.nav_draw);

    private void openDrawer() {
        DrawerLayout drawerLayout = findViewById(R.id.drawerlayout);
        drawerLayout.openDrawer(GravityCompat.END);
    }
}
