public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgrenciKrediManager(), new OgretmenKrediManager(),  new PolisKrediManager()};

        for(BaseKrediManager kredi: krediManagers)
        {
            kredi.adiYaz();
            System.out.println(kredi.krediHesapla(1000));
        }

    }
}
