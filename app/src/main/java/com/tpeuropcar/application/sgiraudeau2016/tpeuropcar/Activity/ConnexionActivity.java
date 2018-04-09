package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;


public class ConnexionActivity extends AppCompatActivity implements ConnexionFragment.OnConnexionListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

    }


    // Se connecter
    @Override
    public void seConnecter(String identifiant, String motDePasse) {

        Intent intent = new Intent(ConnexionActivity.this, ListeActivity.class);
        intent.putExtra("identifiant", identifiant);
        intent.putExtra("motDePasse", motDePasse);
        startActivity(intent);
    }


    // S'inscrire

    @Override
    public void inscrireNewUtilisateur() {
        Intent intent = new Intent(ConnexionActivity.this, InscriptionActivity.class);
        startActivity(intent);
    }


}
