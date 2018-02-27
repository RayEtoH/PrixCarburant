package com.example.eto_ray.prixcarburant.modele.ws;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Eto_Ray on 26/02/2018.
 */

public class OkHttpUtils {
    public static Response sendGetOkHppRequest(String url) throws Exception{
        Log.v("TAG_URL", url);
        OkHttpClient client = new OkHttpClient();


        // creation de la requete

        Request request = new Request.Builder().url(url).build();

        // Execution de la requete

        return client.newCall(request).execute();



    }

}
