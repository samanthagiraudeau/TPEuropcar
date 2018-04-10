package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Agence;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Utilisateur;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service.AgenceService;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service.UtilisateurService;

public class AgenceActivity extends AppCompatActivity implements AgenceFragment.AgenceListener {


    AgenceFragment agenceFragment;
    Agence agenceCorrespondante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agence);

        agenceFragment = (AgenceFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_modification_agence);
        agenceCorrespondante = AgenceService.getInstance().getAgenceCorrespondante();
        agenceFragment.remplirChampsAgence(agenceCorrespondante);

    }

    @Override
    public void onClickModifierAgence(Agence agence) {
        Utilisateur utilisateur = (Utilisateur) getIntent().getSerializableExtra("utilisateur");
        utilisateur.setAgence(agence.getId());
        UtilisateurService.getInstance().inscription(utilisateur);

        Intent intent = new Intent(this, ListeDispoActivity.class);
        intent.putExtra("utilisateur", utilisateur);
        startActivity(intent);
    }
}
