package uygulama03Genel;

public class Ogrendci {
    private String adı;
    private String soyadı;

    public Ogrendci(){

    }
    public Ogrendci(String adı, String soyadı){
        this.adı= adı;
        this.soyadı= soyadı;
    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public String getSoyadı() {
        return soyadı;
    }

    public void setSoyadı(String soyadı) {
        this.soyadı = soyadı;
    }

    @Override
    public String toString() {
        return "Ogrendci{" +
                "adı='" + adı + '\'' +
                ", soyadı='" + soyadı + '\'' +
                '}';
    }
}