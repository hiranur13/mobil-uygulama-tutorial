package com.example.uygulama1;

import java.io.Serializable;

public class Takim implements Serializable {
    int resim;
    String ad;
    int yil;
    String aciklama;

    public Takim(int resim, String ad, int yil, String aciklama) {
        this.resim = resim;
        this.ad = ad;
        this.yil = yil;
        this.aciklama = aciklama;
    }

    public int getResim() {
        return resim;
    }

    public void setResim(int resim) {
        this.resim = resim;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
