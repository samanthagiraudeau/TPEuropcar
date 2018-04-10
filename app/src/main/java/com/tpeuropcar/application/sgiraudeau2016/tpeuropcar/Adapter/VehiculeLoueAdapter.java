package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Tools;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeDisponible;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeLoue;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;

import java.util.ArrayList;

/**
 * Created by sgiraudeau2016 on 09/04/2018.
 */

public class VehiculeLoueAdapter extends BaseAdapter {

    private ArrayList<VehiculeLoue> tousLesVehiculeLoues;
    private LayoutInflater vehiculeInf;

    public VehiculeLoueAdapter(Context c, ArrayList<VehiculeLoue> theVehiculeLoues){
        tousLesVehiculeLoues = theVehiculeLoues;
        vehiculeInf = LayoutInflater.from(c);
    }


    @Override
    public int getCount() {
        return tousLesVehiculeLoues.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        LinearLayout vehiculeLay = (LinearLayout)vehiculeInf.inflate(R.layout.un_vehicule_loue, parent, false);

        TextView libelleView = vehiculeLay.findViewById(R.id.libelle_vehicule);
        TextView dateDebutView = vehiculeLay.findViewById(R.id.date_debut);
        TextView dateFinView = vehiculeLay.findViewById(R.id.date_fin);
        TextView tarifJournalierView = vehiculeLay.findViewById(R.id.tarif_journalier_vehicule);


        VehiculeLoue currVehiculeLoue = tousLesVehiculeLoues.get(i);

        libelleView.setText(currVehiculeLoue.getLibelle());
        dateDebutView.setText(Tools.dateToString(currVehiculeLoue.getDateDebut()));
        dateFinView.setText(Tools.dateToString(currVehiculeLoue.getDateFin()));

        // tarif journalier
        int nbJours = Tools.nbJoursEntreDeuxDates(currVehiculeLoue.getDateDebut(), currVehiculeLoue.getDateFin());
        double tarif = currVehiculeLoue.getTarif() / nbJours;
        tarifJournalierView.setText(String.valueOf(tarif).format("%.2f", tarif));



        vehiculeLay.setTag(i);
        return vehiculeLay;
    }
}
