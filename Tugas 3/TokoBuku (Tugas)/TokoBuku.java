import java.util.ArrayList;

public class TokoBuku {
    private String namaToko;
    private String alamat;
    private ArrayList<Kategori> daftarKategori;

    public TokoBuku(String namaToko, String alamat) {
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.daftarKategori = new ArrayList<>();
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void tambahKategori(Kategori kategori) {
        daftarKategori.add(kategori);
    }

    public void tampilkanInfoToko() {
        System.out.println("========================================");
        System.out.println("Nama Toko : " + namaToko);
        System.out.println("Alamat    : " + alamat);
        System.out.println("========================================");
        System.out.println("Daftar Kategori Buku:");
        if (daftarKategori.isEmpty()) {
            System.out.println("Belum ada kategori yang terdaftar.");
        } else {
            for (Kategori k : daftarKategori) {
                k.infoKategori();
                System.out.println("----------------------------------------");
            }
        }
    }
}