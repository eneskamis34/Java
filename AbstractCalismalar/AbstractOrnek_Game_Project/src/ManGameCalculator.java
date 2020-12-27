public class ManGameCalculator extends GameCalculator {
    @Override
    public void puanHesapla() {
        System.out.println("Erkeklerin puanı");
    }

    public void BilgiMesaji()
    {
        System.out.println("Erkege özel bilgi mesaji.");
    }

    @Override
    public void AdiYazdir(String ad) {
        System.out.println("Adı:" +ad);
    }
}
