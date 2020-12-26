public class Product {

    public Product()
    {
        //default constructor.
        //Kişi manuel tanımlama yapacaksa burayı kullanır.
    }
    //Bu sayede aynı zamanda metot overloading de yapmış oluyoruz.
    public Product(int id, String name, String description, double price, int stockAmount)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }


    //attributes
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String productKod;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    //Kodu sadece GET edebilir ama SET edip kendisini müdahale etmesin diye Setter yazmıyorum.
    //Bir kod mantığı ile birlikte ürünün baş harfi + id numarası ile kod generete ettiriyorum.
    public String getProductKod() {
        return this.name.substring(0,1)+this.id;
    }

}
