public class InheritanceDemo {
    public static void main(String[] args) {
        // Objek subclass 1: Mobil (constructor berparameter -> memanggil super(...) berparameter)
        Mobil mobil1 = new Mobil("Toyota Avanza", 2022, 1500, 4);
        System.out.println("\n=== Info Mobil ===");
        System.out.println(mobil1.getInfo());
        mobil1.menyalakanMesin();
        mobil1.bukaPintu();
        mobil1.mematikanMesin();
        System.out.println("\n----------------------------------\n");

        // Objek subclass 2: Motor (constructor berparameter -> memanggil super(...) berparameter)
        Motor motor1 = new Motor("Yamaha R15", 2023, 155, "Clip-on");
        System.out.println("\n=== Info Motor ===");
        System.out.println(motor1.getInfo());
        motor1.menyalakanMesin();
        motor1.wheelie();
        motor1.mematikanMesin();

        System.out.println("\n----------------------------------\n");

        // Demo overloading: constructor tanpa parameter, atribut diisi manual
        Mobil mobil2 = new Mobil();
        mobil2.merk = "Honda Brio";
        mobil2.tahunProduksi = 2021;
        mobil2.kapasitasMesin = 1200;
        mobil2.setJumlahPintu(5);
        System.out.println("\n=== Info Mobil 2 ===");
        System.out.println(mobil2.getInfo());
        Mobil mobil3 = new Mobil("Suzuki Ertiga", 2020, 1500, 5);
        System.out.println("\n=== Info Mobil 3 ===");
        System.out.println(mobil3.getInfo());
    }
}
