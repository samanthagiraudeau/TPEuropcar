package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by sgiraudeau2016 on 10/04/2018.
 */

public class Tools {


    public static String dateToString(Date date) {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yy");
        return formater.format(date);
    }



    public static Date ajouterJour(Date date, int nbJour) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, nbJour);
        return cal.getTime();
    }


    public static int nbJoursEntreDeuxDates(Date date1, Date date2) {
        long resultat = (date2.getTime()-date1.getTime());

        resultat = resultat/86400000;

        String resul = Long.toString(resultat);
        String[] retour = resul.split(",");

        return Integer.parseInt(retour[0]);

    }


}
