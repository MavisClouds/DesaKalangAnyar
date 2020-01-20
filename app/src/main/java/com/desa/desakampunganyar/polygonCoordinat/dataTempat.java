package com.desa.desakampunganyar.polygonCoordinat;

public class dataTempat {
    double lat,lng;

    public dataTempat(){

    }

    public dataTempat(double lat, double lng){
        this.lat = lat;
        this.lng = lng;
    }

    public void setLat(double lat){
        this.lat = lat;
    }
    public void setLng(double lng){
        this.lng = lng;
    }
    public double getLat(){
        return this.lat;
    }

    public double getLng(){
        return this.lng;
    }
}
