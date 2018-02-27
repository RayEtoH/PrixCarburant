package com.example.eto_ray.prixcarburant.modele.ws.beans;

/**
 * Created by Eto_Ray on 27/02/2018.
 */

public class Prix {
    private String id;

    private String valeur;

    private String maj;

    private String nom;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getValeur ()
    {
        return valeur;
    }

    public void setValeur (String valeur)
    {
        this.valeur = valeur;
    }

    public String getMaj ()
    {
        return maj;
    }

    public void setMaj (String maj)
    {
        this.maj = maj;
    }

    public String getNom ()
    {
        return nom;
    }

    public void setNom (String nom)
    {
        this.nom = nom;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", valeur = "+valeur+", maj = "+maj+", nom = "+nom+"]";
    }
}
