package com.example.uygulama1;

import java.util.Locale;

public class Ulke {
    String ad;
    String baskent;
    String dil;
    int nufus;
    String paraBirimi;
    int siraNo;
    int foto;


    public Ulke(String ad, String baskent, String dil, int nufus, String paraBirimi, int siraNo, int foto) {
        this.ad = ad;
        this.baskent = baskent;
        this.dil = dil;
        this.nufus = nufus;
        this.paraBirimi = paraBirimi;
        this.siraNo = siraNo;
        this.foto = foto;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad.toUpperCase(new Locale("tr","TR"));
    }

    public String getBaskent() {
        return baskent;
    }

    public void setBaskent(String baskent) {
        this.baskent = baskent;
    }

    public String getDil() {
        return dil;
    }

    public void setDil(String dil) {
        this.dil = dil;
    }

    public int getNufus() {
        return nufus;
    }

    public void setNufus(int nufus) {
        this.nufus = nufus;
    }

    public String getParaBirimi() {
        return paraBirimi;
    }

    public void setParaBirimi(String paraBirimi) {
        this.paraBirimi = paraBirimi;
    }

    public int getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(int siraNo) {
        this.siraNo = siraNo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
