/**
 * Class utama untuk menjalankan program.
 * Hewan adalah abstract class sehingga tidak bisa diinstansiasi langsung,
 * maka yang dibuat objeknya adalah subclass-nya (Lebah dan Ular).
 */
public class AbstractClassDemo {

    public static void main(String[] args) {

        // ===== Objek Lebah =====
        System.out.println("===== LEBAH =====");
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();

        System.out.println();
        System.out.println("[Bergerak]");
        lebah1.bergerak();

        System.out.println();
        System.out.println("[Bernapas]");
        lebah1.bernapas();

        System.out.println();

        // ===== Objek Ular =====
        System.out.println("===== ULAR =====");
        Ular ular1 = new Ular(true, 5, "Tikus", "Hutan");
        ular1.cetakInfo();

        System.out.println();
        System.out.println("[Bergerak]");
        ular1.bergerak();

        System.out.println();
        System.out.println("[Bernapas]");
        ular1.bernapas();
    }
}
