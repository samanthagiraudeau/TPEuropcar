package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeDisponible;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeLoue;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Mock.VehiculeDisponibleMock;

import java.util.ArrayList;

/**
 * Created by sgiraudeau2016 on 09/04/2018.
 */

public class VehiculeDisponibleService {
    static VehiculeDisponibleService instance;
    private ArrayList<VehiculeDisponible> vehiculesDisponibles;

    private VehiculeDisponibleService(){
        vehiculesDisponibles = new ArrayList<>();
    }

    public static VehiculeDisponibleService getInstance() {
        if(instance == null){
            instance = new VehiculeDisponibleService();
        }
        return instance;
    }


    public ArrayList<VehiculeDisponible> getListeVehiculesLoues() {
         return vehiculesDisponibles;
    }

    public ArrayList<VehiculeDisponible> getListeVehiculesDisponibles() {
        return vehiculesDisponibles = VehiculeDisponibleMock.getInstance().listeVehicules();
    }


    public VehiculeDisponible getVehiculeLoueById(int id) {
        for(VehiculeDisponible v : vehiculesDisponibles) {
            if(v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    public VehiculeDisponible getVehiculeDisponibleById(int id) {
        for(VehiculeDisponible v : vehiculesDisponibles) {
            if(v.getId() == id) {
                return v;
            }
        }
        return null;
    }


}
