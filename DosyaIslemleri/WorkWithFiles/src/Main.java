import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    getInfoFile();
    readFile();
    writeFile();
    readFile();

    }
    public static void createFile(){
        File file = new File("C:\\Users\\enesk\\Desktop\\javaEE\\olusturulandosya.txt");
        try {
            if(file.createNewFile()) // isimli dosyayı oluştur. Ama hata fırlatacağı için ya try catch yapacğım ya da thwros IOException yazacağım
            {
                System.out.println("Dosya Oluşturuldu");
            }
            else
            {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getInfoFile(){
        File file = new File("C:\\Users\\enesk\\Desktop\\javaEE\\olusturulandosya.txt");
        if(file.exists())
        {
            System.out.println("Dosya adı: "+file.getName());
            System.out.println("Dosya yolu: "+file.getAbsolutePath());
            System.out.println("Dosya okunabilir mi? "+file.canRead());
            System.out.println("Dosya yazılabilir mi? "+file.canWrite());
            System.out.println("Dosya boyutu(byte): "+file.length());

        }
    }

    //bufferRead önce belleğe alır sonra okuma yapar - File direkt olarak okuma yapar.
    public static void readFile(){
        File file = new File("C:\\Users\\enesk\\Desktop\\javaEE\\olusturulandosya.txt");
        try (Scanner scanner = new Scanner(file))
        {
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close(); //dosyayı kapatıyoruz.
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try{
            FileWriter fileWriter = new FileWriter("C:\\Users\\enesk\\Desktop\\javaEE\\olusturulandosya.txt",true); //eğer true demezsem üzerine yazar. Böylece ekleme yapıyor
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.newLine(); // bunu yazmazsam alt satıra değil son satırın yanına ekl
            writer.write("Enes Kamış");
            writer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
