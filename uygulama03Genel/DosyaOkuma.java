package uygulama03Genel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {
    private Scanner sc;
    public void okunacakDosya(String dosyaAdı){
        String dosyaYolu= "C:/Users/user/OneDrive/Masaüstü/";
        File file= new File(dosyaYolu+dosyaAdı+".txt");// Scanner(file) yerine Scanner(new File...) koyabilirsin
        try {
            sc= new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("hata: "+ e );
        }
    }
    public void dosyaOku(){
        String satır;
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
    public void dosyaOkumayıKapat(){
        sc.close();
    }
}
