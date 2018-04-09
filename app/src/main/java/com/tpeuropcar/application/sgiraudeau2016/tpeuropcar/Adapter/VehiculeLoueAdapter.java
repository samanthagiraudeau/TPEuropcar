package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        //map to song layout
        LinearLayout vehiculeLay = (LinearLayout)vehiculeInf.inflate
                (R.layout.un_vehicule_loue, parent, false);
        //get title and artist views
        TextView libelleView = (TextView)vehiculeLay.findViewById(R.id.libelle_vehicule);
               VehiculeLoue currVehiculeLoue = tousLesVehiculeLoues.get(i);

        libelleView.setText(currVehiculeLoue.getLibelle());



        vehiculeLay.setTag(i);
        return vehiculeLay;
    }
}
