import java.util.ArrayList;

public class Kategori {
    private String idKategori;
    private String namaKategori;
    private ArrayList<Buku> daftarBuku;

    public Kategori(String idKategori, String namaKategori) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public void infoKategori() {
        System.out.println("ID Kategori  : " + idKategori);
        System.out.println("Nama Kategori: " + namaKategori);
        System.out.println("Daftar Buku  :");
        if (daftarBuku.isEmpty()) {
            System.out.println("  - Belum ada buku dalam kategori ini.");
        } else {
            for (Buku b : daftarBuku) {
                System.out.println("  - " + b.getInfoBuku());
            }
        }
    }

    public String getNamaKategori() {
        return namaKategori;
    }
}