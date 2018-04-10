package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Mock;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeDisponible;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeLoue;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Interface.IVehiculeDao;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Interface.IVehiculeDisponibleDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class VehiculeDisponibleMock implements IVehiculeDisponibleDao {

    private ArrayList<VehiculeDisponible> vehiculeDisponibles;

    private static VehiculeDisponibleMock instance;

    private VehiculeDisponibleMock(){
        vehiculeDisponibles = populateListMock();
    }

    public static VehiculeDisponibleMock getInstance() {
        if(instance == null){
            instance = new VehiculeDisponibleMock();
        }
        return instance;
    }



    @Override
    public VehiculeDisponible getVehiculeDisponibleById(int id) {
        for(VehiculeDisponible v : vehiculeDisponibles){
            if(v.getId() == id){
                return v;
            }
        }

        return null;
    }


    @Override
    public void insertVehiculeDisponible(VehiculeDisponible vehiculeDisponible) {

    }

    @Override
    public ArrayList<VehiculeDisponible> listeVehicules() {
        return vehiculeDisponibles;
    }

    private ArrayList<VehiculeDisponible> populateListMock(){
        ArrayList<VehiculeDisponible> vehiculeDisponibles = new ArrayList<>();
        vehiculeDisponibles.add(new VehiculeDisponible(1, "Citroen C3D", 5, 3, 12, 75d, 95d));
        vehiculeDisponibles.add(new VehiculeDisponible(2, "PeugeotD", 5, 2, 13, 85d, 105d));
        vehiculeDisponibles.add(new VehiculeDisponible(3, "PassatD", 5, 1, 14, 95d, 125d));
        vehiculeDisponibles.add(new VehiculeDisponible(4, "BMD", 5, 4, 15, 105d, 145d));

        return vehiculeDisponibles;
    }
}
