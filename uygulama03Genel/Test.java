package uygulama03Genel;

public class Test {
    public static void main(String[] args) {
        Ogrendci ogrendci= new Ogrendci("yusuf","zorlu");
        Ogrendci ogrendci1= new Ogrendci("ferhat", "aykan");

        DosyaYazme dosyaYazme= new DosyaYazme();
        boolean dosyaYazmaDurumu=dosyaYazme.dosyalarıYazdır("yeni_metin");
        if(dosyaYazmaDurumu){
            System.out.println("dosya başarılı bir şekilde oluşturuldu");
        }
        else {
            System.out.println("dosya oluşturulamadı");
        }

        dosyaYazme.uyeKaydet(ogrendci);
        dosyaYazme.uyeKaydet(ogrendci1);

        boolean dosyaKapama=dosyaYazme.dosyaYazmayıKapat();
        if(dosyaKapama){
            System.out.println("dosya başarılı bi şekilde kapatıldı ");
        }
        else {
            System.out.println("dosya kapatılırken hata oluştu");
        }

        // okuma kısmı
        DosyaOkuma dosyaOkuma= new DosyaOkuma();
        dosyaOkuma.okunacakDosya("yeni_metin");
        dosyaOkuma.dosyaOku();
        dosyaOkuma.dosyaOkumayıKapat();
    }

}
