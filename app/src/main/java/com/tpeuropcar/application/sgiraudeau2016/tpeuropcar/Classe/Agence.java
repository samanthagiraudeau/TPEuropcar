package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class Agence {

    private int id;
    private String raisonSociale;
    private String siret;
    private String voie;
    private String codePostal;
    private String ville;

    public Agence(int id, String raisonSociale, String siret, String voie, String codePostal, String ville) {
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.siret = siret;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Agence(String raisonSociale, String siret, String voie, String codePostal, String ville) {
        this.raisonSociale = raisonSociale;
        this.siret = siret;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Agence() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
