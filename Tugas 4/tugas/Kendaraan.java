// TUGAS - Superclass (sesuai class diagram: Kendaraan)
public class Kendaraan {
    protected String merk;
    protected Integer tahunProduksi;
    protected Integer kapasitasMesin;

    // Constructor 1: tanpa parameter (overloading)
    public Kendaraan() {
        System.out.println("Constructor Kendaraan tanpa parameter");
    }

    // Constructor 2: berparameter (overloading)
    public Kendaraan(String merk, Integer tahunProduksi, Integer kapasitasMesin) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.kapasitasMesin = kapasitasMesin;
        System.out.println("Constructor Kendaraan berparameter");
    }

    public void menyalakanMesin() {
        System.out.println("Mesin " + merk + " dinyalakan");
    }

    public void mematikanMesin() {
        System.out.println("Mesin " + merk + " dimatikan");
    }

    // Method yang akan di-override oleh subclass
    public String getInfo() {
        String info = "";
        info += "Merk            : " + merk + "\n";
        info += "Tahun Produksi  : " + tahunProduksi + "\n";
        info += "Kapasitas Mesin : " + kapasitasMesin + " cc\n";

        return info;
    }
}
