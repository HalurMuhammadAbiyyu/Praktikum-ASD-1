package latihanPraktikum;

public class latihanMain1 {
    public static void main(String[] args) {
        latihan1 l1 = new latihan1();

        l1.nama = "Headset kz";
        l1.hargaSatuan = 150000;
        l1.jumlah = 2;
        l1.hitungHargaTotal();

        System.out.println("-----------------------------");
        System.out.println("       Toko HeadSet");
        System.out.println("-----------------------------");

        System.out.println("Nama Barang       = " + l1.nama);
        System.out.println("Harga             = " + l1.hargaSatuan);
        System.out.println("Jumlah            = " + l1.jumlah);

        int total = l1.hitungHargaTotal();
        System.out.println("Harga Total       = " + total);

        l1.hargaDiskon(total);
        int totalDiskon = l1.hargaDiskon(total);
        System.out.println("Diskon            = " + totalDiskon);

        l1.hitungHargaBayar(total, totalDiskon);
        int totalHargaBayar = l1.hitungHargaBayar(total, totalDiskon);
        System.out.println("Total Harga Bayar = " + totalHargaBayar);

    }
}
