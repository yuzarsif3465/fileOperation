package uygulama01PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
// Exception bazı hataları görmezden gelsin diye kullanılıyor bu hataları bir de sınıflandırmışlar.
public class DosyaIslemelri {
    public static void main(String[] args) {
        System.out.println("yazmaya basladın.");
        // NOT: try dışında kullanmak isstersem ---> PrintWriter yazici= null;
        try {
            PrintWriter yazici= new PrintWriter("C:/Users/user/OneDrive/Masaüstü/Metin_belgesi.txt");

            yazici.println("yusuf zorlu dosya yazmaya başladı.");
            yazici.println("cok şukur ");
            //dosya içine birşey yazmak istiyorsan dosyayı kapatmalısın
            yazici.close();

        } catch (FileNotFoundException e) {// fileNFE yerine sadece Exception yazabilirsin.
            // bunun anlamı hatayı direk göster ---> e.printStackTrace();
            System.err.println("Hata: "+ e);// hata olan kısmı daha belirgin görebilmek için "out" yerine "err" yazacaz
        }
        System.out.println("yazmayı bıraktın.");

    }
}
