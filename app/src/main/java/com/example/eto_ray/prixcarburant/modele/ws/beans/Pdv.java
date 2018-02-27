package com.example.eto_ray.prixcarburant.modele.ws.beans;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by Eto_Ray on 27/02/2018.
 */

public class Pdv {

    private String id;

    private Services services;

    private String cp;

    private String adresse;

    private Prix[] prix;

    private String ville;

    private String longitude;

    private String pop;

    private Ouverture ouverture;

    private String latitude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Prix[] getPrix() {
        return prix;
    }

    public void setPrix(Prix[] prix) {
        this.prix = prix;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public Ouverture getOuverture() {
        return ouverture;
    }

    public void setOuverture(Ouverture ouverture) {
        this.ouverture = ouverture;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    private static final String ns = null;

    @Override
    public String toString() {
        return "ClassPojo [id = " + id + ", services = " + services + ", cp = " + cp + ", adresse = " + adresse + ", prix = " + prix + ", ville = " + ville + ", longitude = " + longitude + ", pop = " + pop + ", ouverture = " + ouverture + ", latitude = " + latitude + "]";
    }

    public Pdv(String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
    // Xml

    public static Pdv readPdv(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "entry");
        String longitude = null;
        String latitude = null;
        // String link = null;
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            if (name.equals("longitude")) {
                longitude = readLongitude(parser);
            } else if (name.equals("latitude")) {
                latitude = readLatitude(parser);
            //ink = readLink(parser);
            } else {
                skip(parser);
            }
        }
        return new Pdv(longitude, latitude);
    }

    private static void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.getEventType() != XmlPullParser.START_TAG) {
            throw new IllegalStateException();
        }
        int depth = 1;
        while (depth != 0) {
            switch (parser.next()) {
                case XmlPullParser.END_TAG:
                    depth--;
                    break;
                case XmlPullParser.START_TAG:
                    depth++;
                    break;
            }
        }
    }

    //
    private static String readLongitude(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "longitude");
        String title = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "longitude");
        return title;
    }
    //
    private static String readLatitude(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "latitude");
        String summary = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "latitude");
        return summary;
    }
    //
    private static String readText(XmlPullParser parser) throws IOException, XmlPullParserException {
        String result = "";
        if (parser.next() == XmlPullParser.TEXT) {
            result = parser.getText();
            parser.nextTag();
        }
        return result;
    }

}



