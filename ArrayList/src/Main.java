import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add("Istanbul");

        for(Object i : list)
        {
            System.out.println(i);
        }

        //Arraylist Obje tuttugu için foreach içerisinde int - String vs. denilmez Object türünden referans gösterilir.

        list.remove(1); // Siler
        //list.set(2,"Bursa"); // O indexin değerini değiştirir.
        list.clear(); // Tüm diziyi siler.


        ArrayList<String> list2 = new ArrayList<String>(); //Bu şekilde tanımlayarak sadece String ifade almasını sağlıyoruz.

        list2.add("Ankara");
        list2.add("Bursa");
        list2.add("Afyon");
        list2.add("İstanbul");

        Collections.sort(list2); //sıralama yapıyor.
        list2.remove("Bursa"); //isim ile de silme  yapabiliyor.
        for(Object i:list2)
        {
            System.out.println(i);
        }

        //class tipi ile Arraylist olusturma
        ArrayList<Customer> musteriler = new ArrayList<Customer>();

        musteriler.add(new Customer(1,"Enes","Kamış"));
        musteriler.add(new Customer(2,"Ahmet","Mehmet"));
        musteriler.add(new Customer(3,"Ayşe","Meltem"));

        for(Customer i: musteriler)
        {
            System.out.println(i.name);
        }
        musteriler.remove(new Customer(1,"Enes","Kamış")); // Bu bellekten silme yapmaz. Çünkü new ile referans tip tekrar olusumu sağlanıyor.
        //Ama bunu şöyle tanımlarsak:
        Customer Enes = new Customer(1,"Enes","Kamış");
        musteriler.remove(Enes); // bu sefer siler.


    }
}
