package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Agence;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Mock.AgenceMock;

import java.util.Random;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class AgenceService {

    private static AgenceService instance;

    private AgenceService(){

    }

    public static AgenceService getInstance() {
        if(instance == null){
            instance = new AgenceService();
        }
        return instance;
    }

    public Agence getAgenceCorrespondante(){

        Random generator = new Random();
        int i = generator.nextInt(3);

        return AgenceMock.getInstance().getAgenceById(i);
    }


}
