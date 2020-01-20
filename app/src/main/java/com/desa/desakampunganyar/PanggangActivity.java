package com.desa.desakampunganyar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PanggangActivity extends AppCompatActivity {

    Button umkmPanngang, pertanianPanggang, wisataPanggang, peternakanPanggang, perkebunanPanggang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panggang);

        umkmPanngang = findViewById(R.id.menuUMKMPanggang);
        pertanianPanggang = findViewById(R.id.menuPertanianPanggang);
        wisataPanggang = findViewById(R.id.menuPariwisataPanggang);
        peternakanPanggang = findViewById(R.id.menuPeternakanPanggang);
        perkebunanPanggang = findViewById(R.id.menuPerkebunanPanggang);

        umkmPanngang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUmkm();
            }
        });
        pertanianPanggang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPertanian();
            }
        });
        wisataPanggang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PanggangActivity.this, "Belum ada potensi Pariwisata di Dusun Panggang", Toast.LENGTH_SHORT).show();
            }
        });
        peternakanPanggang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PanggangActivity.this, "Belum ada potensi Peternakan di Dusun Panggang", Toast.LENGTH_SHORT).show();
            }
        });
        perkebunanPanggang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKebun();
            }
        });
    }

    public void openUmkm(){
        Intent bukaUmkm = new Intent(this, umkmPanggangActivity.class);
        startActivity(bukaUmkm);
    }
    public void openPertanian(){
        Intent bukaPertanian = new Intent(this, pertanianPanggangActivity.class);
        startActivity(bukaPertanian);
    }

    public void openKebun(){
        Intent bukaKebun = new Intent(this, perkebunanPanggangActivity.class);
        startActivity(bukaKebun);
    }
}
