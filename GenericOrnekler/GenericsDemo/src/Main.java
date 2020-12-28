public class Main {
    public static void main(String[] args) {
        //Generic tipler Interface ile de kullanılabilir.

        //IEntity bizim ana referans Interface görevimizi görüyor.
        //Veritabanına erişmesini istediğimiz Customer ve Product sınıflarına bunu implemente ediyoruz.
        //Ancak Validator'ın kullanılmasını istemediğimiz için bunda implement etmiyoruz.
        //IEntityRepository -> <T extends IEntity>
        //Burada da veri tipimiz olan T i IEntityden extends ederek güvenlik sağlıyoruz bu sayede;
        //CustomerDal veya ProductDal da IEntity almamış sınıfı kullanamaz oluyor.
        //Yani tip güvenliği sağlayarak sadece istediğimiz sınıfların erişimini sağlıyoruz.

    }
}
