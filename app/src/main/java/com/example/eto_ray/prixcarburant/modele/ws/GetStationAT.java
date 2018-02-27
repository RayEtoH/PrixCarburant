package com.example.eto_ray.prixcarburant.modele.ws;

import android.os.AsyncTask;

/**
 * Created by Eto_Ray on 27/02/2018.
 */

public class GetStationAT extends AsyncTask {


    @Override
    protected  Object doInBackground (Object[] params) {
        try {
            WSUtils.getStations();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
