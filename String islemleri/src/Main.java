public class Main {
    public static void main(String[] args) {
        String metin = "Bu bir deneme yazisidir.";
        System.out.println(metin.charAt(8)); // d çıktısını verir.

        //concat - ile birleştirme yapılır.
        System.out.println(metin.concat("Birlesiyor"));

        //startsWith(ara) - Başlıyorsa True döner
        //endsWith(ara) - Bitiyorsa True döner

        System.out.println(metin.startsWith("B"));
        System.out.println(metin.endsWith("x"));

        //getChars - (basla,kaca kadar+1, dizi adi, kaçtan itibaren atayım) ile char dizisine atama yapar.
        char[] karakterler = new char[10];
        metin.getChars(0,2,karakterler,0);
        System.out.println(karakterler);

        //indexOf - kaçıncı sırada bulur.
        //lastIndexOf - Ters taraftan kaçıncı sırada bulur.

        System.out.println(metin.indexOf("d"));
        System.out.println(metin.lastIndexOf("d"));

        //replace - ile bir metni değiştirebiliriz.
        String yeniMetin = metin.replace(" ","-"); //boşlukları - yap.
        System.out.println(yeniMetin);

        //substring - ile metni istediğimiz yerden kesebiliyoruz.
        String kisaIfade = metin.substring(0,2);
        System.out.println(kisaIfade); //Bu

        //trim - ile boşlukları kaldırıyoruz.
        System.out.println(metin.trim());

        //sprit - ile metni bir regexe göre ayırabiliyoruz
        for(String kelime:metin.split(" ")) //boşluktan sonra parçalıyor metni.
        {
            System.out.println(kelime);
        }

















    }
}
