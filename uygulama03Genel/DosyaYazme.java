package uygulama03Genel;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaYazme {
    private PrintWriter printWriter;

    public boolean dosyalarıYazdır(String dosyaAdı){
        String dosyaYolu="C:/Users/user/OneDrive/Masaüstü/";
        try {
            //diger metotlarda printWriter kullanabilmek için dışarıda tanımladık
            /*PrintWriter*/ printWriter= new PrintWriter(dosyaYolu+dosyaAdı+".txt");
            // normalde bu kısma dosya yolunu eklersin ama classı her calıstırdıgında aynı yer ekleme yapar.
            // dosya adını girebilmek icin dosya yolunu ayrı tutmak gerekiyor
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Hata: "+e);
            return false;
        }

    }
    public void uyeKaydet(Ogrendci ogrendci){
        String adı= ogrendci.getAdı();
        String soyadı= ogrendci.getSoyadı();

        printWriter.println("adı: "+ adı+ " soyadı: "+ soyadı);
        // bunları yazdırabilmek icin dosyayı kapatmak gerekiyor ama bu metot icinde kapatırsan sadece bir ogrenci alırsın
        // bunun icin ayrıca bir metot tanımlamalısın

    }
    public boolean dosyaYazmayıKapat(){
        try{
            printWriter.close();
            return true;
        }catch (Exception e){
            System.err.println("");
            return false;
        }
    }

}
