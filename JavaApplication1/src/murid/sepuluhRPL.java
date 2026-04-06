package murid;


public class sepuluhRPL {
    
    public static void main(String[] args) {
        siswaRPL objek = new siswaRPL();
        muridRPL ob = new muridRPL();
        System.out.println(objek.nama1);
        System.out.println("nama anda adalah: " + objek.nama1);
        objek.nama1 = "ragil1";
        System.out.println("nama anda adalah: " + objek.nama1);
        
        System.out.println("");
        
        objek.datasiswa();
        
        int tampilanluas = objek.menghitungpersegi();
        System.out.println("luas persegi adalah " + tampilanluas);
//        System.out.println(objek.menghitungpersegi());
        
        ob.hobisiswa();
        int tampilanlingkaran = ob.menghitunglingkaran();
        System.out.println("luas lingkaran adalah: " + tampilanlingkaran + "cm");
        }
}
