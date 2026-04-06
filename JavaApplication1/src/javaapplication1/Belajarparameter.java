public class Belajarparameter {
    public static void main(String[] args) {
        hitungluas(8.1, 9.4);
        hitungluas(7.7, 6.9);
        hitungluas(8.8, 9.7);
        hitungluas(3.4, 7.4);
    }
    public static void hitungluas (double alas, double tinggi) {
    double luas = 0.5 * alas * tinggi;
    
    System.out.println("--- Perhitungan Segitiga ---");
        System.out.println("alas   : " + alas + "cm");
        System.out.println("tinggi : " + tinggi + "cm");
        System.out.println("luas   : " + luas + "cm");
        System.out.println("----------------------------");
    }
}