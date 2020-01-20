package com.desa.desakampunganyar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PanelActivity extends AppCompatActivity {

    Button menuKrajan, menuKopencuking, menuKalibendo, menuPanggang, menuPejopuro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        menuKrajan = findViewById(R.id.dusunKrajan);
        menuKopencuking = findViewById(R.id.dusunKopencuking);
        menuKalibendo = findViewById(R.id.dusunKalibendo);
        menuPanggang = findViewById(R.id.dusunPanggang);
        menuPejopuro = findViewById(R.id.dusunPejopuro);

        menuKrajan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKrajan();
            }
        });

        menuKopencuking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKopencuking();
            }
        });

        menuKalibendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKalibendo();
            }
        });

        menuPanggang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPanggang();
            }
        });

        menuPejopuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPejopuro();
            }
        });
    }

    public void openKrajan(){
        Intent bukaKrajan = new Intent(this, KrajanActivity.class);
        startActivity(bukaKrajan);
    }

    public void openKopencuking(){
        Intent bukaKopencuking = new Intent(this, KopencukingActivity.class);
        startActivity(bukaKopencuking);
    }

    public void openKalibendo(){
        Intent bukaKalibendo = new Intent(this, KalibendoActivity.class);
        startActivity(bukaKalibendo);
    }

    public void openPanggang(){
        Intent bukaPanggang = new Intent(this, PanggangActivity.class);
        startActivity(bukaPanggang);
    }

    public void openPejopuro(){
        Intent bukaPejopuro = new Intent(this, PejopuroActivity.class);
        startActivity(bukaPejopuro);
    }
}
