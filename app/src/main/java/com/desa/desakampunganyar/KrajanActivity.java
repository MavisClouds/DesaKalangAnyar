package com.desa.desakampunganyar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class KrajanActivity extends AppCompatActivity {

    Button umkmKrajan, wisataKrajan, pertanianKrajan, perkebunanKrajan, peternakanKrajan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krajan);

        umkmKrajan = findViewById(R.id.menuUMKMKrajan);
        wisataKrajan = findViewById(R.id.menuPariwisataKrajan);
        pertanianKrajan = findViewById(R.id.menuPertanianKrajan);
        perkebunanKrajan = findViewById(R.id.menuPerkebunanKrajan);
        peternakanKrajan = findViewById(R.id.menuPeternakanKrajan);

        umkmKrajan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUMKM();
            }
        });

        wisataKrajan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWisata();
            }
        });

        pertanianKrajan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(KrajanActivity.this, "Belum ada potensi Pertanian pada Dusun Krajan",Toast.LENGTH_SHORT).show();
            }
        });

        perkebunanKrajan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(KrajanActivity.this, "Belum ada potensi Perkebunan pada Dusun Krajan",Toast.LENGTH_SHORT).show();
            }
        });

        peternakanKrajan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(KrajanActivity.this, "Belum ada potensi Peternakan pada Dusun Krajan",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void openUMKM(){
        Intent bukaUMKM = new Intent(this, umkmKrajanActivity.class);
        startActivity(bukaUMKM);
    }

    public void openWisata(){
        Intent bukaWisata = new Intent(this, wisataKrajanActivity.class);
        startActivity(bukaWisata);
    }
}
