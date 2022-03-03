# Laporan Praktikum 2
## Nama     : Halur Muhammad Abiyyu
## Kelas    : 1F
## NIM      : 2141720072



### 2.2.3 Pertanyaan
1. Sebutkan 2 karakteristik class/objek!

Jawab : atribut dan method

2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?

Jawab : class

3. Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class
tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?

Jawab : 4 Atribut yaitu namaBarang, jenisBarang, stok, hargaSatuan. deklarasi atribut dilakukan pada baris 13 dan 14.

4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja
deklarasi method dilakukan?

Jawab : 4 method yaitu, tampilBarang, tambahStok, kurangiStok, hitungHargaTotal. di deklarasi pada baris 16, 23, 27,, 31.

5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut
sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)


jawab 

void kurangiStok(int n) {
        
        if(stok > 0){
            stok=stok-n;
        }else{
            System.out.println("Stok kosong");
        }
    }

<img src = "kumpulan foto/stokKosong.png">

6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa
bilangan int?

Jawab : parameter int tersebut untuk mengoutputkan bilangan bulat

7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?

Jawab : Karena ini menghitung suatu nilai dari jumlah * hargaSatuan dan suatu nilainya harus dikembalikkan

8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?

Jawab : karena di method ini hanya ingin menampilkan stok barang yang ditambahkan

### 2.3.3 Pertanyaan
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek
yang dihasilkan? 

Jawab : pada baris 19-25, nama objeknya : b1.namaBarang = "Xiaomi"; b1.jenisBarang = "Smartphone"; b1.hargaSatuan = 1750000; b1.stok = 10; b1.tambahStok(1); b1.kurangStok(3); b1.tampilBarang();.

2. Bagaimana cara mengakses atribut dan method dari suatu objek?

Jawab : menuliskan nama instansiasi diteruskan dengan kata kunci titik dan diteruskan dengen nama atribut dan method pada class

### 2.4.3 Pertanyaan
1. Perhatikan class Barang yang ada di Praktikum 2.4.1, pada baris berapakah deklarasi
konstruktor berparameter dilakukan?

Jawab :pada baris ke 18

2. Perhatikan class BarangMain di Praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris
program dibawah ini?

Jawab : baris code tersebut berfungsi untuk menyiapkan barang ke 2 yang ingin di masukkan. 

3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class
Barang.

Jawab : 

    barang b3 = new barang("Asus", "wireless headset", 3, 100000);
    b3.tampilBarang();

<img src = "kumpulan foto/hasilB3.png">


# Latihan Praktikum
## No 1

```
public class latihan1 {

    String nama;
    int jumlah, hargaSatuan;

    int hitungHargaTotal(){
        return jumlah*hargaSatuan;
    }
    
    int hargaDiskon(int totalHarga){
        int totalDiskon;
        if(totalHarga > 100000){
            totalDiskon = totalHarga * 10/100;
        }else if(totalHarga > 50000 && totalHarga <= 100000){
            totalDiskon = totalHarga*5/100;
        }else{
            totalDiskon = 0;    
        }
        
        return totalDiskon;
    }

    int hitungHargaBayar(int total,int diskon){
        int hargaBayar;
        hargaBayar = total - diskon;

        return hargaBayar;
        
    }


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
```

## Hasil Program

<img src = "kumpulan foto/hasilBarangHeadset.png">

## NO 2

```
package pacman;

public class pacman {
    int x, y, weidht, height;

    void moveLeft(){
        x = x - 1;
    }    
    void moveRigth(){
        x = x + 1;
    }
    void moveDown(){
        y = y - 1;
    }
    void moveUp(){
        y = y + 1;
    }

    void printPosition(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("weidht = " + weidht);
        System.out.println("height = " + height);
    }
}   

public class pacmanMain {
    public static void main(String[] args) {
        pacman p1 = new pacman();
        p1.x = 3;
        p1.y = 5;
        p1.weidht = 10;
        p1.height = 10;
        p1.moveRigth();
        p1.moveUp();
        p1.printPosition();
    }
}

```
## Hasil Progaram
<img src = "kumpulan foto/hasilPacman1.png">




