public class Main {
    public static void main(String[] args) {
        //Generic bir nevi tip güvenliği sağlamamızı sağlayan yapıdır.
        //<T> T ya da herhangi bir şey olabilir bununla yazılır.

        MyList<String> myList = new MyList<String>();
        myList.add("Enes");
        //myList.add(1); //hata verir. String tipi değil.

        MyList<Customer> myList2 = new MyList<Customer>();
        myList2.add(new Customer());

    }
}
