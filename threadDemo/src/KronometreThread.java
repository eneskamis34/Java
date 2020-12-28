public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName)
    {
        this.threadName = threadName;
        System.out.println("Thread Oluşturuluyor..: "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Thread Çalıştırılıyor..: "+threadName);

        try{
            for(int i = 0; i < 10; i++)
            {
                System.out.println(threadName +": "+ i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println("Kesildi");
        }
        System.out.println("Bitti");
    }
    public void start()
    {
        System.out.println("Thread nesnesi oluşturuldu.");
        if(thread==null)
        {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
