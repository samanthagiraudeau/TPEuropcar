package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;

public class InscriptionActivity extends AppCompatActivity implements InscriptionFragment.OnInscriptionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }

    @Override
    protected void onResume() {
        super.onResume();



    }

    @Override
    public void inscrireNewUtilisateur(String identifiant) {
        Toast.makeText(this, "Bonjour " + identifiant, Toast.LENGTH_LONG).show();
    }
}
