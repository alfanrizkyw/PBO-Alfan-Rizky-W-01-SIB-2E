/**
 * Abstract class Hewan.
 * Berfungsi sebagai superclass (generalisasi) untuk semua jenis hewan.
 * Class ini tidak dapat diinstansiasi (tidak bisa dibuat objeknya).
 */
public abstract class Hewan {

    // ===== Atribut =====
    public double berat;
    public String makanan;
    public String habitat;

    // ===== Constructor =====
    public Hewan(double berat, String makanan, String habitat) {
        this.berat = berat;
        this.makanan = makanan;
        this.habitat = habitat;
    }

    // ===== Abstract method =====
    // Hanya deklarasi (tanpa body), wajib di-override oleh subclass.
    public abstract void bergerak();

    public abstract void bernapas();

    // ===== Method biasa =====
    // Memiliki body, sehingga tidak wajib di-override oleh subclass.
    public void cetakInfo() {
        System.out.println("Berat   : " + this.berat);
        System.out.println("Makanan : " + this.makanan);
        System.out.println("Habitat : " + this.habitat);
    }
}
