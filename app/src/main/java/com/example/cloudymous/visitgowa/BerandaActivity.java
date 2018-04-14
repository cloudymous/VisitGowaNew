package com.example.cloudymous.visitgowa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class BerandaActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        ImageView toastSetting = findViewById(R.id.settingToast);
        ImageView toastMenu = findViewById(R.id.menuToast);


        toastMenu.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Toast.makeText(BerandaActivity.this, "Tombol Menu Belum Disetting", Toast.LENGTH_LONG).show();
            }
        });

        toastSetting.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Toast.makeText(BerandaActivity.this, "Tombol Belum Disetting", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void btnFoodClicked(View view) {
        Intent foodLayoutIntent = new Intent(BerandaActivity.this, Activity_ListFood.class);
        startActivity(foodLayoutIntent);
    }

    public void btnNatureClicked(View view) {
        Intent natureLayoutIntent = new Intent(BerandaActivity.this, Activity_ListNature.class);
        startActivity(natureLayoutIntent);
    }

    public void btnHeritageClicked(View view) {
        Intent heritageLayoutIntent = new Intent(BerandaActivity.this, Activity_ListHeritage.class);
        startActivity(heritageLayoutIntent);
    }

    public void btnSportClicked(View view) {
        Intent sportLayoutIntent = new Intent(BerandaActivity.this, Activity_ListSport.class);
        startActivity(sportLayoutIntent);
    }

}

