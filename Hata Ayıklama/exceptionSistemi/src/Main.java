public class Main {
    public static void main(String[] args) {

        try
        {
            int[] dizi = new int[]{1,2,3};
            System.out.println(dizi[4]);
        }
        catch (StringIndexOutOfBoundsException s) //1
        {
            System.out.println(s+" hatası olustu.");
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println(a + " hatası olustu."); //2
        }
        catch (Exception e)
        {
            System.out.println("Bir hata oluştu ve hata: "+e);  //3
        }
        finally
        {
            System.out.println("Burası her zaman çalışır.");
        }
        //finaly try çalışsa da catch çalışsa da çalışır.


        /*
        1 numaralı yapı programcının beklediği bir hata tipi varsa ve yönlendirme - işlem yapma gibi durumlar için koyulur
        2 numaralı yapı çalısırsa zaten ana Exception çalışmayacaktır.
        1 ve 2 numaralı hata yönetimleri 3 numaralı Excepti
         */

    }
}
