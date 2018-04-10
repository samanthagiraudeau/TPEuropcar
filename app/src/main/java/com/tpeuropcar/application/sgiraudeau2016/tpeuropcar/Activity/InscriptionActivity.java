package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Utilisateur;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service.UtilisateurService;

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
    public void inscrireNewUtilisateur(Utilisateur utilisateur) {
        Intent intent = new Intent(this, AgenceActivity.class);
        intent.putExtra("utilisateur", utilisateur);
        startActivity(intent);
    }
}
