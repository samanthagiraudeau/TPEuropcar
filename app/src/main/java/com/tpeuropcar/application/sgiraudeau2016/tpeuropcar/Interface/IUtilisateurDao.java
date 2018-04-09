package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Interface;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Utilisateur;

import java.util.List;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public interface IUtilisateurDao {

    Utilisateur getUtilisateurByMail(String mail);

    Utilisateur getUtilisateurById(int id);

    void insertUtilisateur(Utilisateur utilisateur);

    List<Utilisateur> listeUtilisateurs();

}
