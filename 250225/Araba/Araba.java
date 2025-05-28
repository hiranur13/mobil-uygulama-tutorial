package com.example.uygulama1;

public class Araba {
    private String marka;
    private String model;
    private int sonHiz;
    private int anlikHiz;
    private boolean calisiyorMu;


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSonHiz() {
        return sonHiz;
    }

    public void setSonHiz(int sonHiz) {
        this.sonHiz = sonHiz;
    }

    public int getAnlikHiz() {
        return anlikHiz;
    }

    public void setAnlikHiz(int anlikHiz) {
        if(anlikHiz<=0){ //araba hızının negatif değere düşmesini engelledik.
            this.anlikHiz=0;
        }
        else if(anlikHiz>sonHiz){ //Arabanın Hızını sınırlandırdık.
            this.anlikHiz=sonHiz;
        }
        else{ //Diğer durumlarda hıızını belirledik.
            this.anlikHiz=anlikHiz;
        }
    }

    public boolean isCalisiyorMu() {
        return calisiyorMu;
    }

    public void setCalisiyorMu(boolean calisiyorMu) {
        this.calisiyorMu = calisiyorMu;
    }


    public Araba(String marka, String model, int sonHiz) {
        this.marka = marka;
        this.model = model;
        this.sonHiz = sonHiz;
        this.anlikHiz=0;//Varsayılan hız.
        this.calisiyorMu=false;//Başlangıçta calışmıyor.
    }

    //Fonksiyonları oluşturalım.   4 adet fonksiyon oluşturuldu.

    public String calistir(){
        if(calisiyorMu){ //Araba Çalışıyorsa
            return "Araba zaten Çalışıyor.";
        }
        calisiyorMu=true;
        return "Araba çalıştırıldı";
    }

    public String durdur(){
        if(anlikHiz>0){
            return "Arabanın Hızı: "+anlikHiz+" km/h olduğu için durdurulmadı.";
        }
        if(calisiyorMu){ //Araba çalışıyorsa
            calisiyorMu=false; //durdur
            return "Araba durduruldu."; //geriye mesaj yolla
        }
        else{
            return "Araba zaten durdurulmuş."; //Araba zaten durdurulmuşsa
        }
    }

    public void hizlan(int hiz){
        if(calisiyorMu){
            setAnlikHiz(anlikHiz+hiz);//Doğrudan setter metodunu kullanıyoruz.
        }
    }

    public void yavasla(int hiz){
        if(calisiyorMu){
            setAnlikHiz(anlikHiz-hiz);
        }
    }
}
