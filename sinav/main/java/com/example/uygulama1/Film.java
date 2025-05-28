package com.example.uygulama1;

public class Film {
    String ad;
    String oyuncu;
    String konu;
    int siraNo;
    int foto;

    public Film(String ad, String oyuncu, String konu, float puan, int siraNo, int foto) {
        this.ad = ad;
        this.oyuncu = oyuncu;
        this.konu = konu;
        this.puan = puan;
        this.siraNo = siraNo;
        this.foto = foto;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }





    public String getOyuncu() {
        return oyuncu;
    }

    public void setOyuncu(String oyuncu) {
        this.oyuncu = oyuncu;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public float getPuan() {
        return puan;
    }

    public void setPuan(float puan) {
        this.puan = puan;
    }

    float puan;
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
