/**
 * Class Lebah adalah subclass dari Hewan.
 * Wajib mengimplementasikan seluruh abstract method milik Hewan.
 */
public class Lebah extends Hewan {

    // ===== Atribut tambahan =====
    public String kasta;

    // ===== Constructor =====
    public Lebah(String kasta, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat); // memanggil constructor Hewan
        this.kasta = kasta;
    }

    // ===== Implementasi abstract method =====
    @Override
    public void bernapas() {
        System.out.println("Otot perut mengendur, udara masuk melalui lubang di segmen tubuh");
        System.out.println("Trakea mengirimkan oksigen");
        System.out.println("Otot perut berkontraksi, udara dikeluarkan");
    }

    @Override
    public void bergerak() {
        System.out.println("Mengepakkan sayap ke depan");
        System.out.println("Memutar sayap hampir 90 derajat");
        System.out.println("Mengepakkan sayap ke belakang");
    }

    // ===== Override method biasa (opsional) =====
    @Override
    public void cetakInfo() {
        super.cetakInfo(); // mencetak info dari Hewan terlebih dahulu
        System.out.println("Kasta   : " + this.kasta);
    }
}
