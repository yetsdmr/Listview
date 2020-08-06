package com.example.listview;

public class KullaniciModel {

    String isim;
    String soyisim;
    String yas;
    String tuttuguTakim;

    public KullaniciModel(String isim, String soyisim, String yas, String tuttuguTakim) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.tuttuguTakim = tuttuguTakim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getTuttuguTakim() {
        return tuttuguTakim;
    }

    public void setTuttuguTakim(String tuttuguTakim) {
        this.tuttuguTakim = tuttuguTakim;
    }



}
