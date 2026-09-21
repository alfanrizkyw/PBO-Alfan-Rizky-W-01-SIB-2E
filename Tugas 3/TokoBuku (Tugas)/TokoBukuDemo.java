public class TokoBukuDemo {
    public static void main(String[] args) {
        // 1. Instansiasi Toko Buku
        TokoBuku toko = new TokoBuku("Gramedia Digital", "Jl. Sudirman No. 45, Jakarta");

        // 2. Instansiasi Kategori
        Kategori kat1 = new Kategori("KAT-01", "Teknologi & Pemrograman");
        Kategori kat2 = new Kategori("KAT-02", "Fiksi & Novel");

        // 3. Instansiasi Buku
        Buku buku1 = new Buku("978-602-123", "Pemrograman Berorientasi Objek dengan Java", "Tim Dosen PBO", 125000);
        Buku buku2 = new Buku("978-602-456", "Belajar Struktur Data untuk Pemula", "Alfan Rizky", 95000);
        Buku buku3 = new Buku("978-602-789", "Pulang-Peram", "Tere Liye", 85000);

        // 4. Memasukkan Buku ke dalam Kategori (Relasi)
        kat1.tambahBuku(buku1);
        kat1.tambahBuku(buku2);
        kat2.tambahBuku(buku3);

        // 5. Memasukkan Kategori ke dalam Toko Buku (Relasi)
        toko.tambahKategori(kat1);
        toko.tambahKategori(kat2);

        // 6. Menampilkan Informasi Toko
        toko.tampilkanInfoToko();
    }
}