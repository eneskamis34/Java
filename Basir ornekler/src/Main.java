public class Main {
    public static void main(String[] args) {
        //Asal mi? Değil mi?

        int number = 25;
        boolean isPrime = true;

        if(number == 1)
        {
            System.out.println("Sayi asal değildir");
            return;
        }
        else if(number < 1)
        {
            System.out.println("Geçersiz Sayi");
        }
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
            {
                isPrime = false;
            }
        }
        if(isPrime)
        {
            System.out.println("Asal");
        }
        System.out.println("Asal Değil");
    }
}
