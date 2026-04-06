import java.util.Scanner;

public class percabangan {
    
    public static void main(String[] args) {
//        int nilai;
        Scanner Inputuser = new Scanner (System.in);
        System.out.print("inputkan nilai anda: ");
        int nilai = Inputuser.nextInt();
        System.out.println("nilai anda: " + nilai);
        
        if (nilai >= 90 && nilai <= 100) {
            System.out.println();
        } else if (nilai >= 89 && nilai <= 80) {
            System.out.println("A");
        } else if (nilai >= 79 && nilai <= 70) {
            System.out.println("B");
        } else if (nilai >= 69 && nilai <= 60) {
            System.out.println("C");
        } else if (nilai >= 59 && nilai <= 50) {
            System.out.println("D");
        } else if (nilai <= 50) {
            System.out.println("E");
        } else {
            System.out.println("salah input");
        }
    }
}
