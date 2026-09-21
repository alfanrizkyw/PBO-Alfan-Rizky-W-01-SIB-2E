public class Buku {
    private String isbn;
    private String judul;
    private String penulis;
    private double harga;

    public Buku(String isbn, String judul, String penulis, double harga) {
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getInfoBuku() {
        return "ISBN: " + isbn + ", Judul: " + judul + ", Penulis: " + penulis + ", Harga: Rp " + harga;
    }

    public void updateHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    // Getter tambahan jika diperlukan untuk keperluan informasi
    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public double getHarga() {
        return harga;
    }
}