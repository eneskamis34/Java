public abstract  class GameCalculator {

    public abstract void puanHesapla();

    public void BilgiMesaji()
    {
        System.out.println("Bu bir bilgi mesajıdır.");
    }

    public abstract void AdiYazdir(String ad);

    //final ile kimse override edip değiştiremez.
    //Bu sınıfı extends edecek kişiye zorunlu olarak gider.
    public final void gameOver()
    {
        System.out.println("Oyun Bitti!");
    }
}
