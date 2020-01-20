package com.desa.desakampunganyar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button panelMap, mapDesa, profileDesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panelMap = findViewById(R.id.panel_masuk);
        mapDesa = findViewById(R.id.map_desa);
        profileDesa = findViewById(R.id.profil_desa);

        panelMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPanel();
            }
        });

        /*mapDesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });*/

        profileDesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });
    }
    public void openPanel() {
        Intent openingPanel = new Intent(this, PanelActivity.class);
        startActivity(openingPanel);
    }
    public void buka(View view) {
        Intent openingPanel = new Intent(this, MappingActivity.class);
        startActivity(openingPanel);
    }
    /*public void openMap(){
        Intent openingMap = new Intent(this, MapActivity.class);
        startActivity(openingMap);
    }*/
    public void openProfile(){
        Intent openingProfil = new Intent(this, ProfilActivity.class);
        startActivity(openingProfil);
    }
}
