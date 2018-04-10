package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class VehiculeLoue {

    private int id;
    private String libelle;

    public VehiculeLoue(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public VehiculeLoue(String libelle) {
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

}
