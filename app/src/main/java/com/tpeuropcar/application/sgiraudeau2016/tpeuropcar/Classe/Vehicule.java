package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class Vehicule {

    private int id;
    private String libelle;
    private boolean disponible;

    public Vehicule(int id, String libelle, boolean disponible) {
        this.id = id;
        this.libelle = libelle;
        this.disponible = disponible;
    }

    public Vehicule(String libelle, boolean disponible) {
        this.libelle = libelle;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
