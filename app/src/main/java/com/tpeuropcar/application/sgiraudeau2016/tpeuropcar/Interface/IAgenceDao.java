package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Interface;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Agence;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public interface IAgenceDao {

    void insertAgence(Agence agence);

    Agence getAgenceById(int id);

    void deleteAgence(int id);

    void updateAgence(Agence agence);

}
