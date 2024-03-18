package ornek;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class main {

        public static void DosyaYazma(){
            File file = new File("C:/Users/user/OneDrive/Masaüstü/Yeni Metin Belgesi.txt"); // hangi dosya üzerinde işlem yapacağımızı seçiyoruz.
            try {
// Dosyaya yazmak için nesnemizi oluşturuyoruz.
                FileOutputStream fos = new FileOutputStream(file);
// Ekleyeceğimiz yazıyı yazıyoruz.
                String yazi = "Bu benim ekleyeceğim ilk yazıdır. \nBuda aşağı satıra yazılacak";
//Yazma işlemini gerçekleştiriyoruz.
                fos.write(yazi.getBytes());
                fos.flush();
// İşlemimiz bitince kaynaklarımızı kapatıyoruz. Boşuna sistemde hazır beklemesinler.
                fos.close();
            } catch (FileNotFoundException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
        }



public class MainPage {
            public void main(String[] args) {
                DosyaYazma();
            }
        }
    }

