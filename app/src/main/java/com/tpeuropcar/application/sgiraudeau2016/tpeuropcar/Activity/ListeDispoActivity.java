package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Adapter.VehiculeDisponibleAdapter;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeDisponible;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service.VehiculeDisponibleService;

public class ListeDispoActivity extends AppCompatActivity implements ListeDispoFragment.ListeDisponiblesListener{

    ListeDispoFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_disponibles);

    }


    @Override
    protected void onResume() {
        super.onResume();
        fragment = (ListeDispoFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_liste_dispo);
        fragment.setListe(VehiculeDisponibleService.getInstance().getListeVehiculesDisponibles());
    }

    @Override
    public void onClickListLoues() {
        Intent intent = new Intent(ListeDispoActivity.this, ListeLoueActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClickElementListe(VehiculeDisponible vehiculeDisponible) {
        Intent intent = new Intent(this, FormulaireLocation.class);
        intent.putExtra("vehiculeDisponible", vehiculeDisponible);
        startActivity(intent);
    }
}
