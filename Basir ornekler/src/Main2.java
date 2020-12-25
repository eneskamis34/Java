public class Main2 {
    public static void main(String[] args) {
        // Kalın mı Sesli mi Harf?
        //Kalınlar A I O U
        //Inceler E İ Ö Ü

        char harf = 'A';

        switch (harf)
        {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Harftir");
                break;
            default:
                System.out.println("İnce Harftir");
        }
    }
}
