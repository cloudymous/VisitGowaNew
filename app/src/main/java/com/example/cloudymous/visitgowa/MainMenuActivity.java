package com.example.cloudymous.visitgowa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

//        Button tombolMulai = findViewById(R.id.startButton);
//        tombolMulai.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mulaiBeranda = new Intent (MainMenuActivity.this,BerandaActivity.class);
//                startActivity(mulaiBeranda);
//            }
//        });


    }

    public void startBeranda(View view) {
        Intent mulaiBeranda = new Intent(MainMenuActivity.this, BerandaActivity.class);
        startActivity(mulaiBeranda);
    }
}
