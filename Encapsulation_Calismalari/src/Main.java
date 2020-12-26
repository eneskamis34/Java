public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Monster Oyuncu Bilgisayarı");
        product.setPrice(6700);
        product.setStockAmount(7);

        Product product1 = new Product(1,"Televizyon","Akıllı TV",3400,8);

        System.out.println(product1.getProductKod());

        //ProductManager kısmını ayrı bir class yapmamızın sebebi SOLİD (Single Responsibility Principle)
        //Sebebiyle her sınıfın ya da metodun sadece kendine has sorumluluğu olması için ayrı yapılmıştır.
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getProductKod());

    }
}
