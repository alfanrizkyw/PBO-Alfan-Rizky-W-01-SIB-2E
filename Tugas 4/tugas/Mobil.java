// TUGAS - Subclass Mobil
public class Mobil extends Kendaraan {
    private Integer jumlahPintu;

    // Constructor 1: tanpa parameter (otomatis memanggil super() default)
    public Mobil() {
        System.out.println("Constructor Mobil tanpa parameter");
    }

    // Constructor 2: berparameter -> memanggil super(...) berparameter di baris pertama
    public Mobil(String merk, Integer tahunProduksi, Integer kapasitasMesin, Integer jumlahPintu) {
        super(merk, tahunProduksi, kapasitasMesin);
        this.jumlahPintu = jumlahPintu;
        System.out.println("Constructor Mobil berparameter");
    }

    public Integer getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(Integer jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public void bukaPintu() {
        System.out.println("Pintu mobil " + merk + " dibuka");
    }

    // OVERRIDING: nama, parameter, dan return type sama dengan Kendaraan.getInfo()
    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Jumlah Pintu    : " + jumlahPintu + "\n";

        return info;
    }
}
