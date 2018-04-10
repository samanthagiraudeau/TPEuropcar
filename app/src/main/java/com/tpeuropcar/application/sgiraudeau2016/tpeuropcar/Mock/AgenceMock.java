package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Mock;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Agence;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Interface.IAgenceDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class AgenceMock implements IAgenceDao{

    private List<Agence> agences;

    private static AgenceMock instance;

    public static AgenceMock getInstance() {
        if(instance == null){
            instance = new AgenceMock();
        }
        return instance;
    }

    private AgenceMock(){
        agences = populateAgences();
    }

    @Override
    public void insertAgence(Agence agence) {

    }

    @Override
    public Agence getAgenceById(int id) {
        return agences.get(id);
    }

    @Override
    public void deleteAgence(int id) {

    }

    @Override
    public void updateAgence(Agence agence) {

    }

    private List<Agence> populateAgences(){
        List<Agence> agences = new ArrayList<>();
        agences.add(new Agence(1, "SA", "362 521 879 00034","voie 1","44000","Nantes"));
        agences.add(new Agence(2, "SA", "362 521 879 00034","voie 2","44800","Saint Herblain"));
        agences.add(new Agence(3, "SA", "362 521 879 00034","voie 3","49000","Angers"));
        agences.add(new Agence(4, "SA", "362 521 879 00034","voie 4","85000","La Roche sur yon"));

        return agences;
    }
}
