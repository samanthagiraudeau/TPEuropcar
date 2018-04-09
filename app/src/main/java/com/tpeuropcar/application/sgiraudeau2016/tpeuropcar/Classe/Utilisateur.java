package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

@Entity(tableName = "Utilisateur")
public class Utilisateur {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String mail;
    private String motDePasse;
    @ForeignKey(childColumns = "agence", parentColumns = "id", entity = Agence.class)
    private int agence;

    public int getAgence() {
        return agence;
    }

    public void setAgence(int agence) {
        this.agence = agence;
    }

    public Utilisateur(String mail, String motDePasse) {
        this.mail = mail;
        this.motDePasse = motDePasse;
    }

    public Utilisateur(int id, String mail, String motDePasse) {
        this.id = id;
        this.mail = mail;
        this.motDePasse = motDePasse;
    }

    public Utilisateur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
