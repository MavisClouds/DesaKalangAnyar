package com.desa.desakampunganyar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PejopuroActivity extends AppCompatActivity {

    Button umkmRejopuro, wisataRejopuro, pertanianRejopuro, perkebunanRejopuro, peternakanRojopuro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pejopuro);

        umkmRejopuro = findViewById(R.id.menuUMKMPejopuro);
        wisataRejopuro = findViewById(R.id.menuPariwisataPejopuro);
        pertanianRejopuro = findViewById(R.id.menuPertanianPejopuro);
        perkebunanRejopuro = findViewById(R.id.menuPerkebunanPejopuro);
        peternakanRojopuro = findViewById(R.id.menuPeternakanPejopuro);

        umkmRejopuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUmkm();
            }
        });
        wisataRejopuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWisata();
            }
        });
        pertanianRejopuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPertanian();
            }
        });
        perkebunanRejopuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PejopuroActivity.this, "Belum ada potensi Perkebunan di Dusun Rejopuro", Toast.LENGTH_SHORT).show();
            }
        });
        peternakanRojopuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPeternakan();
            }
        });
    }

    public void openUmkm(){
        Intent bukaUmkm = new Intent(this, umkmRejopuroActivity.class);
        startActivity(bukaUmkm);
    }
    public void openWisata(){
        Intent bukaWisata = new Intent(this, pariwisataRejopuroActivity.class);
        startActivity(bukaWisata);
    }
    public void openPertanian(){
        Intent bukaPertanian = new Intent(this, pertanianRejopuroActivity.class);
        startActivity(bukaPertanian);
    }
    public void openPeternakan(){
        Intent bukaPeternakan = new Intent(this, peternakanRejopuroActivity.class);
        startActivity(bukaPeternakan);
    }
}
