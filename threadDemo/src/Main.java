public class Main {
    public static void main(String[] args) {
        /*
        Thread veya MultiThread
        Birbirini takip eden işlemler gerekiyorsa veya bir işlemdeki veri sonraki işlemde gerekiyorsa Single thread kullanılır.
        Ancak birbirinden bağımsız olarak işlevi olan işlemleri aynı anda işleme sokrak multi therad yaparak zaman kazanılır.
         */

        KronometreThread t1 = new KronometreThread("thread1");
        KronometreThread t2 = new KronometreThread("thread2");
        KronometreThread t3 = new KronometreThread("thread3");

        t1.start();
        t2.start();
        t3.start();


    }
}
