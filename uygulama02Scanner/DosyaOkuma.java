package uygulama02Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {
    public static void main(String[] args) {
        File dosya= new File("C:/Users/user/OneDrive/Masaüstü/Metin_belgesi.txt");
        try {
            Scanner sc= new Scanner(dosya);
            /*String ilkKelime= sc.next();
            String ikinciKelime= sc.next();

            String ilkSatır= sc.nextLine();

            System.out.println(ilkKelime);
            System.out.println(ilkSatır);*/

            /*String metin;
            while (sc.hasNext()){// sc nexte(kelimeye sahip mi) true ise girer. Aynı şekilde nextLine vb. de yaparsın
                metin= sc.next();
                System.out.println(metin);
            }*/

            // başka bir yazım şekli..
            String belge= ""; // normalde boşluk koyarsın ama outputda cıkmaması için bosluk koyduk.
            while (sc.hasNextLine()){
                belge+=sc.nextLine();
                belge+=" ";
            }
            System.out.println(belge);
            sc.close();


        } catch (FileNotFoundException e) {
            System.out.println("Hata: "+ e);
        }

    }
}
