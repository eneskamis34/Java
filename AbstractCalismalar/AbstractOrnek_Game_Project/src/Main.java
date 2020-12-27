public class Main {
    public static void main(String[] args) {
        //Abstract Ornek
        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        kidsGameCalculator.gameOver();
        kidsGameCalculator.puanHesapla();

        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.BilgiMesaji();
        manGameCalculator.AdiYazdir("Enes");

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.BilgiMesaji();

        //Abstract class içerisinde abstract metot olmak zorunda değildir
        //Ama abstract metot barındıran class abstract class olmak zorundadır.
        //extends eden classlar abstract classta ne varsa kullanmak zorundadırlar.
    }
}
