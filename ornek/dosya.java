package ornek;

import java.io.*;

public class dosya {
    public static void main(String[] args) {
        OutputStream outputStream;

        try {
            FileOutputStream fileOutputStream= new FileOutputStream("C:/Users/user/OneDrive/Masaüstü/Yeni Metin Belgesi.txt");
            try {
                outputStream = new ObjectOutputStream(fileOutputStream);
                outputStream.write( 4);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
