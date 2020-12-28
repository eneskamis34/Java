import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    //throws: Eğer try catch ile tutmak istemiyorsan bunun bir hata vereceğini belli etmek için hata fırlatırım gibisinden uyarı veriyor.
    public static void main(String[] args) throws IOException {
        int toplam = 0;
        BufferedReader bufferedReader = null;
        try
        {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\enesk\\Desktop\\javaEE\\exceptionDemo\\src\\sayilar.txt"));
            String line = null;
            while((line = bufferedReader.readLine())!= null)
            {
                toplam += Integer.valueOf(line);
            }
        }
        catch (FileNotFoundException f)
        {
            f.printStackTrace();
        }
        finally {
            bufferedReader.close();
        }

    }
}
