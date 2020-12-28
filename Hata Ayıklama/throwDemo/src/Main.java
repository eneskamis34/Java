public class Main {
    public static void main(String[] args)  {

        AccountManager account = new AccountManager();
        System.out.println(account.getBalance());

        account.deposit(100);
        System.out.println(account.getBalance());

        //bunu yazdığımda hata veriyor ya metot başına "throws Exception" yazacağım ya da try catch içerisine alacağım.
        try
        {
            account.withDraw(110);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(account.getBalance());

        try
        {
            account.withDraw(150); //bu sefer de ya metot bşaına "throws myException" yazacağım ya da try catch içerisine alacağım.
        }
        catch (myException e)
        {
            System.out.println(e);
        }


    }
}
