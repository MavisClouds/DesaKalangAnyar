package com.desa.desakampunganyar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class KopencukingActivity extends AppCompatActivity {

    Button umkmKopencungking, pertanianKopencungking, wisataKopencungking, perkebunanKopencungking, peternakanKopencungking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopencuking);

        umkmKopencungking = findViewById(R.id.menuUMKMKopencuking);
        pertanianKopencungking = findViewById(R.id.menuPertanianKopencuking);
        wisataKopencungking = findViewById(R.id.menuPariwisataKopencuking);
        perkebunanKopencungking = findViewById(R.id.menuPerkebunanKopencuking);
        peternakanKopencungking = findViewById(R.id.menuPeternakanKopencuking);

        umkmKopencungking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUmkm();
            }
        });

        pertanianKopencungking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPertanian();
            }
        });

        perkebunanKopencungking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPerkebunan();
            }
        });
        peternakanKopencungking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPeternakan();
            }
        });

        wisataKopencungking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(KopencukingActivity.this, "Belum ada potensi Pariwisata di Dusun Kopencungking", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void openUmkm(){
        Intent bukaUmkm = new Intent(this, umkmKopencungkingActivity.class);
        startActivity(bukaUmkm);
    }

    public void openPertanian(){
        Intent bukaPertanian = new Intent(this, pertanianKopencungkingActivity.class);
        startActivity(bukaPertanian);
    }

    public void openPerkebunan(){
        Intent bukaPerkebunan = new Intent(this, perkebunanKopencungkingActivity.class);
        startActivity(bukaPerkebunan);
    }

    public void openPeternakan(){
        Intent bukaPeternakan = new Intent(this, peternakanKopencungkingActivity.class);
        startActivity(bukaPeternakan);
    }
}
