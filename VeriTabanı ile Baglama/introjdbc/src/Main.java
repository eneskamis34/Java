import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Kurulum
        //File - project structers - modules - dependices - +Jar - programfilesx86 - mysql - connection j - jarı seç - apply et.

        selectDemo();
        deleteDemo();
        insertData();
        updateData();

    }







    public static void selectDemo() throws SQLException{
        //SELECT Islemi için yapıldı
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        Statement statement = null; //sql statement
        ResultSet resultSet; //sql sonuc kısmı
        try {
            connection = dbHelper.getConnection(); //Dbhelper sınıfımıza bağladık
            System.out.println("Bağlantı oluştu.");
            statement = connection.createStatement(); // statementı birden fazla db olabilir diye istediğimiz dbe bağlıyoruz
            resultSet = statement.executeQuery("SELECT Code, Name, Continent, Region FROM world.Country\n"); //hangi sorguyu çalıstıracaksak onu yaızyoruz.

            ArrayList<Country> countries = new ArrayList<Country>(); //ülkeleri çekeceğiz onun için Country tipinde arraylist yapıyoruz.

            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            for(Country c: countries)
            {
                c.goster(); //ülkeleri yazdırmak için çağırıyorum.
            }
        }
        catch (SQLException e)
        {
            dbHelper.showErrorMessage(e);
        }
        finally
        {
            connection.close();
        }
    }

    public static void insertData ()throws SQLException
    {
        //INSERT ISLEMI
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null; //Normal Statement yerine insertte PreparedStatement kullanılıyor.
        //resultset yok.

        try
        {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("insert into world.city (Name,CountryCode,District,Population) values ('Esenler','TUR','Istanbul',650000)");
            statement.executeUpdate(); //insert için update kullanıyoruz.
            System.out.println("Kayıt Eklendi");
        }
        catch (SQLException e)
        {
            dbHelper.showErrorMessage(e);
        }
        finally
        {
            statement.close(); //kapatmayı unutmuyoruz.
            connection.close();
        }
    }



    public static void updateData() throws SQLException {
        //UPDATE ISLEMI

        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null; //Normal Statement yerine insertte PreparedStatement kullanılıyor.
        //resultset yok.

        try
        {
            connection = dbHelper.getConnection();
            //statement = connection.prepareStatement("UPDATE world.city SET population=475684, district='ist' WHERE id = 4084 ");
            statement = connection.prepareStatement("UPDATE world.city SET population=475684, district='ist' WHERE id = ? "); // id kısmını dışarıdan alacaksak.
            statement.setInt(1,455244); //1.soru işareti yerine bu gelecek demek.
            statement.executeUpdate();
            System.out.println("Güncelleme yapıldı Eklendi");
        }
        catch (SQLException e)
        {
            dbHelper.showErrorMessage(e);
        }
        finally
        {
            statement.close(); //kapatmayı unutmuyoruz.
            connection.close();
        }
    }

    public static void deleteDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null; //Normal Statement yerine insertte PreparedStatement kullanılıyor.
        //resultset yok.
        try
        {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("DELETE FROM world.city  WHERE id = ? "); // id kısmını dışarıdan alacaksak.
            statement.setInt(1,4084); //1.soru işareti yerine bu gelecek demek.
            statement.executeUpdate();
            System.out.println("Kayıt Silindi");
        }
        catch (SQLException e)
        {
            dbHelper.showErrorMessage(e);
        }
        finally
        {
            statement.close(); //kapatmayı unutmuyoruz.
            connection.close();
        }
    }

}
