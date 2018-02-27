package com.example.eto_ray.prixcarburant.modele.ws.beans;

/**
 * Created by Eto_Ray on 27/02/2018.
 */

public class Ouverture {

    private String saufjour;

    private String fin;

    private String debut;

    public String getSaufjour ()
    {
        return saufjour;
    }

    public void setSaufjour (String saufjour)
    {
        this.saufjour = saufjour;
    }

    public String getFin ()
    {
        return fin;
    }

    public void setFin (String fin)
    {
        this.fin = fin;
    }

    public String getDebut ()
    {
        return debut;
    }

    public void setDebut (String debut)
    {
        this.debut = debut;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [saufjour = "+saufjour+", fin = "+fin+", debut = "+debut+"]";
    }

}
