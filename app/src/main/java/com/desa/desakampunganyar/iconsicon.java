package com.desa.desakampunganyar;

public class iconsicon {

    private String nama;
    private double lat,lng;
    public MapFragment mapFragment;
    private String suri;
    private String uri;

    public iconsicon(){}

    public iconsicon(double lat, double lng, String nama, String suri, String uri) {
        this.nama = nama;
        this.lat = lat;
        this.lng = lng;
        this.suri = suri;
        this.uri = uri;
    }

    public String getUri(){
        return this.uri;
    }

    public String getSuri() {
        return suri;
    }

    public double getLng() {
        return lng;
    }

    public double getLat() {
        return lat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setSuri(String suri) {
        this.suri = suri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
