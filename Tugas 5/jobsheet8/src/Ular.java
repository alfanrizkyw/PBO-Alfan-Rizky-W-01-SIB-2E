/**
 * Class Ular adalah subclass dari Hewan.
 * Wajib mengimplementasikan seluruh abstract method milik Hewan.
 */
public class Ular extends Hewan {

    // ===== Atribut tambahan =====
    public boolean isBerbisa;

    // ===== Constructor =====
    public Ular(boolean isBerbisa, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat); // memanggil constructor Hewan
        this.isBerbisa = isBerbisa;
    }

    // ===== Implementasi abstract method =====
    @Override
    public void bergerak() {
        System.out.println("Mengerutkan otot dari segala sisi hingga membentuk lengkungan");
        System.out.println("Menemukan titik penahan seperti batu atau pohon");
        System.out.println("Menggunakan sisik untuk mendorong tubuh ke depan");
    }

    @Override
    public void bernapas() {
        System.out.println("Otot tulang rusuk kontraksi, udara masuk lewat hidung");
        System.out.println("Trakea mengirimkan udara ke paru-paru");
        System.out.println("Otot tulang rusuk relaksasi, udara dikeluarkan lewat hidung");
    }

    // ===== Override method biasa (opsional) =====
    @Override
    public void cetakInfo() {
        super.cetakInfo(); // mencetak info dari Hewan terlebih dahulu
        System.out.println("Berbisa : " + (this.isBerbisa ? "Ya" : "Tidak"));
    }
}
