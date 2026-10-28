// TUGAS - Subclass Motor
public class Motor extends Kendaraan {
    private String jenisStang;

    // Constructor 1: tanpa parameter
    public Motor() {
        System.out.println("Constructor Motor tanpa parameter");
    }

    // Constructor 2: berparameter -> memanggil super(...) berparameter di baris pertama
    public Motor(String merk, Integer tahunProduksi, Integer kapasitasMesin, String jenisStang) {
        super(merk, tahunProduksi, kapasitasMesin);
        this.jenisStang = jenisStang;
        System.out.println("Constructor Motor berparameter");
    }

    public String getJenisStang() {
        return jenisStang;
    }

    public void setJenisStang(String jenisStang) {
        this.jenisStang = jenisStang;
    }

    public void wheelie() {
        System.out.println("Motor " + merk + " melakukan wheelie!");
    }

    // OVERRIDING
    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Jenis Stang     : " + jenisStang + "\n";

        return info;
    }
}
