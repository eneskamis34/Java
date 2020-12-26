import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        mesajYaz();
        System.out.println(topla(1,4));

        int toplam = hesapMakinesiToplamasi(5,7,8,9,2524,63); //istediğin kadar sayi girebilirsin.
        System.out.println(toplam);
    }

    public static void mesajYaz()
    {
        System.out.println("Bu bir Metot Mesajıdır.");
    }

    public static int topla(int sayi1, int sayi2)
    {
        return sayi1+sayi2;
    }


    /*
    Variable Arguments - ile Çalışmak
    (...) ile kullanılır.
    Aslında arka planda bir diziye çeviriyor diyebiliriz.
    Hesap makinesi mantığı gibi istediğimiz kadar sayıda eleman girişine izin verir.
     */
    public static int hesapMakinesiToplamasi(int... sayilar)
    {
        int toplam = 0;
        for(int topla:sayilar)
        {
            toplam += topla;
        }
        return toplam;
    }
}
