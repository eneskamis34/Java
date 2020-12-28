public class AccountManager {
    private double balance;

    public void deposit(double amonunt)
    {
        balance += amonunt;
    }

    /*
//throws: ile bunu kullanacak kişinin hata fırlatacağını konusunda uyarıyorum ve ya try catch ya da excception yapmasını sağlıyorum.
    public void withDraw(double amount) throws Exception {
        if(balance>= amount)
        {
            balance -= amount;
        }
        else
        {
            throw new Exception("Bakiye Yetersiz!");
            //throw: ile bir hata olusturuyorum ve diğer taraftan yönetilebilirlik sağlıyorum.
        }
    }

    */



    //Aynı metodu kendi Hata yönetimim ile yapacağım
    public void withDraw(double amount) throws myException {
        if(balance>= amount)
        {
            balance -= amount;
        }
        else
        {
            throw new myException("Bakiye Yetersiz!");
            //throw: ile bir hata olusturuyorum ve diğer taraftan yönetilebilirlik sağlıyorum.
        }
    }

    public double getBalance()
    {
        return balance;
    }

}
