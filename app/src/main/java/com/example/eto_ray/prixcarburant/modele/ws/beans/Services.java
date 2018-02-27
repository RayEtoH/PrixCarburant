package com.example.eto_ray.prixcarburant.modele.ws.beans;

/**
 * Created by Eto_Ray on 27/02/2018.
 */

 public class Services {

    private String[] service;

    public String[] getService ()
    {
        return service;
    }

    public void setService (String[] service)
    {
        this.service = service;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [service = "+service+"]";
    }
}
