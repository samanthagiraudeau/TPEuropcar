package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service.UtilisateurService;


public class ConnexionActivity extends AppCompatActivity implements ConnexionFragment.OnConnexionListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

    }


    // Se connecter
    @Override
    public void seConnecter(String identifiant, String motDePasse) {

        if(UtilisateurService.getInstance().connexion(identifiant, motDePasse)){
            Intent intent = new Intent(ConnexionActivity.this, ListeActivity.class);
            intent.putExtra("identifiant", identifiant);
            intent.putExtra("motDePasse", motDePasse);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Mail ou mot de passe incorrects", Toast.LENGTH_SHORT).show();
        }
    }


    // S'inscrire

    @Override
    public void inscrireNewUtilisateur() {
        Intent intent = new Intent(ConnexionActivity.this, InscriptionActivity.class);
        startActivity(intent);
    }


}
