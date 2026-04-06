public class Mobil {
    // Atribut (Variabel Instance)
    private String merk;
    private String warna;
    private int kecepatan;

    // 1. Constructor dengan Parameter (this untuk atribut)
    public Mobil(String merk, String warna) {
        this.merk = merk;   // "this.merk" merujuk ke atribut di atas
        this.warna = warna; // "warna" merujuk ke parameter constructor ini
        this.kecepatan = 0;
    }

    // 2. Overloading Constructor (this untuk memanggil constructor lain)
    public Mobil(String merk) {
        this(merk, ""); // Memanggil constructor pertama dengan warna default "Putih"
    }

    // 3. Method untuk mengubah nilai (Setter)
    public void setKecepatan(int kecepatan) {
        if (kecepatan >= 0) {
            this.kecepatan = kecepatan;
        }
    }

    // 4. Method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Mobil " + this.merk + " berwarna " + this.warna + 
                           " melaju dengan kecepatan " + this.kecepatan + " km/jam.");
    }

    // Main method untuk menjalankan kode di NetBeans
    public static void main(String[] args) {
        // Membuat objek menggunakan constructor 2 parameter
        Mobil mobil1 = new Mobil("ferari", "merah");
        mobil1.setKecepatan(80);
        mobil1.tampilkanInfo();

        // Membuat objek menggunakan constructor 1 parameter (default Putih)
        Mobil mobil2 = new Mobil("Honda", "hijau");
        mobil2.tampilkanInfo();
    }
}