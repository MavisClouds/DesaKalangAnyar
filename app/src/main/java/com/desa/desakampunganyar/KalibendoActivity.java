package com.desa.desakampunganyar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class KalibendoActivity extends AppCompatActivity {
    Button umkmManjaheKalibendo, wisataKalibendo, pertanianKalibendo, perkebunanKalibendo, peternakanKalibendo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalibendo);

        umkmManjaheKalibendo = findViewById(R.id.menuUMKMKalibendo);
        wisataKalibendo = findViewById(R.id.menuPariwisataKalibendo);
        pertanianKalibendo = findViewById(R.id.menuPertanianKalibendo);
        perkebunanKalibendo = findViewById(R.id.menuPerkebunanKalibendo);
        peternakanKalibendo = findViewById(R.id.menuPeternakanKalibendo);

        umkmManjaheKalibendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUmkm();
            }
        });
        wisataKalibendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWisata();
            }
        });
        perkebunanKalibendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWisata();
            }
        });
        pertanianKalibendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(KalibendoActivity.this, "Belum ada potensi Pertanian di Dusun Kalibendo", Toast.LENGTH_SHORT).show();
            }
        });
        peternakanKalibendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(KalibendoActivity.this, "Belum ada potensi Peternakan di Dusun Kalibendo", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void openUmkm(){
        Intent bukaUMKM = new Intent(this, umkmKalibendoActivity.class);
        startActivity(bukaUMKM);
    }
    public void openWisata(){
        Intent bukaWisata = new Intent(this, wisataKalibendoActivity.class);
        startActivity(bukaWisata);
    }
}
