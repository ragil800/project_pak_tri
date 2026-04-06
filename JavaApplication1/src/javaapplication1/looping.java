public class looping {
    public static void main(String[] args) {
        
        for(int a = 1; a <= 5; a++) {
            System.out.println(a + " gill");
        }
        
        System.out.println();
        
        int tinggi = 10;

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for (int i = 1; i <= tinggi; i++) {
            for (int s = tinggi - i; s > 0; s--) {
                System.out.print(" ");
            }
            
            for (int b = 1; b <= (2 * i - 1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
    }
}
