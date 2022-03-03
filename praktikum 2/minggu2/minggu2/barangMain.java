package minggu2;

    public class barangMain {
        public static void main(String[] args) {
            barang b1 = new barang();
            b1.namaBarang = "Corsair 2 GB";
            b1.jenisBarang = "DDR";
            b1.hargaSatuan = 250000;
            b1.stok = 10;
            b1.tambahStok(0);
            b1.kurangiStok(10);
            b1.tampilBarang();
            int hargaTotal = b1.hitungHargaTotal(4);
            System.out.println("Harga 4 buah = "+hargaTotal);
            System.out.println(" ");
            barang b2 = new barang("logitech", "wireless mouse", 25, 150000 );
            b2.tampilBarang();
            System.out.println(" ");
            barang b3 = new barang("Asus", "wireless headset", 3, 100000);
            b3.tampilBarang();
            
        }
    }

