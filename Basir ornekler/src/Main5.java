public class Main5 {
    public static void main(String[] args) {
        //Sayı Arama
        //İstenilen Sayı Dizi de var mı kontrol etme

        int[] sayiDizisi = new int[]{1,4,7,8,55,66,57,22,16,33};
        int arananSayi = 55;
        boolean varMı = false;
        //55 Bu dizi de var mı Yok mu?

        for(int ara:sayiDizisi)
        {
            if(ara == arananSayi)
            {
                varMı = true;
                break;
            }
        }
        if(varMı)
        {
            System.out.println("Sayi Dizi de VAR");

        }
        else
        {
            System.out.println("Sayi Dizi de YOK");
        }



    }
}
