package uygulama01PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
// burada sadece hata oldugunu belirtmek için kukllanırız..
public class Throws {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("yazmaya basla");
        PrintWriter yazici = new PrintWriter("C:/User/user/OneDrive/Masaüstü/Metin_belgesi.txt");
        yazici.println("yusuf zorlu başladı.");//dosya içine birşey yazmak istiyorsan dosyayı kapatmalısın
        yazici.close();
        System.out.println("Hata: ");
        // Not: threw de hata varsa kod devam etmez
    }
}
