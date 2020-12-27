public class OgrenciKrediManager extends BaseKrediManager{

    public void adiYaz(){
        System.out.print("Ogrenci Kredisi: ");
    }

    public double krediHesapla(double tutar)
    {
        return tutar * 1.15;
    }
}
