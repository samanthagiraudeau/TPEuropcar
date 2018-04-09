package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;

public class ListeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);
    }


    @Override
    protected void onResume() {
        super.onResume();

        String utilisateur = getIntent().getStringExtra("identifiant");
        String motDePasse = getIntent().getStringExtra("motDePasse");

        Toast.makeText(this, "utilisateur : " + utilisateur + ", mot de passe : " + motDePasse, Toast.LENGTH_LONG).show();

    }
}
