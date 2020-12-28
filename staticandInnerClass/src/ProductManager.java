public class ProductManager {
    public void add(Product product)
    {
        //Ben burada isValid özelliğini kullanarak doğru ise DB'e eklemesini isteyeceğim.
        //ProductValidator productValidator = new ProductValidator(); //Eğer isValid'i static yaparsam böyle tanımlamak zorunda kalmam
        //if(productValidator.isValid(product))
        ProductValidator productValidator = new ProductValidator();
        if(ProductValidator.isValid(product)) //bu şekilde direkt Class üzerinden çekebilirim.
        {
            System.out.println(productValidator.mesajYaz(product.name)+" İsimli Ürün Eklendi.");
        }
        else
        {
            System.out.println("Geçersiz Ürün Bilgileri");
        }
    }

    //Burada mesajYaz metodunu static olmadığı için new ile oluşturarak çekebiliyoruz.
}
