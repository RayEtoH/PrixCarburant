package com.example.eto_ray.prixcarburant.modele.ws;

import android.util.Log;

import com.example.eto_ray.prixcarburant.modele.ws.beans.Pdv;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import okhttp3.Response;


/**
 * Created by Eto_Ray on 26/02/2018.
 */

public class WSUtils {


    public static final String URL="https://donnees.roulez-eco.fr/opendata/instantane";

    public static void  getStations() throws Exception{

        Response response = OkHttpUtils.sendGetOkHppRequest(URL);
        if (response.code() != HttpURLConnection.HTTP_OK){
            throw new Exception("reponse du serveur incorect :" + response.code());

        } else {
            Log.v("TAG", response.body().string());

        }

    }


}
