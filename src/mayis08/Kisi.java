package mayis08;

public class Kisi {
    /*
    Öğretmen: Ad-Soyad,  kimlik No, yaş
    Öğrenci:  Ad-Soyad,  kimlik No, yaş
     */
    private String ad;
    private String sad;
    private String tcNo;
    private int yas;

    public Kisi() {
    }

    public Kisi(String ad, String sad, String tcNo, int yas) {
        this.ad = ad;
        this.sad = sad;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSad() {
        return sad;
    }

    public void setSad(String sad) {
        this.sad = sad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return  "ad='" + ad + '\'' +
                "sad='" + sad + '\'' +
                "tcNo='" + tcNo + '\'' +
                "yas=" + yas ;
    }
}
