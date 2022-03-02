package no2;

import java.util.Scanner;

public class tanahMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terluas = 0;
        String tanahTerluas = "";

        //input banyak tanah
        System.out.print("Jumlah tanah: ");
        Tanah[] tanah = new Tanah[sc.nextInt()];

        //loop input panjang lebar
        System.out.println();
        for (int i=0; i<tanah.length; i++) {
            tanah[i] = new Tanah();
            System.out.println("Tanah " + (i+1));
            System.out.print("Panjang: ");
            tanah[i].panjang = sc.nextInt();
            System.out.print("Lebar: ");
            tanah[i].lebar = sc.nextInt();
        }
        System.out.println();

        //loop output luas tanah
        for (int i=0; i<tanah.length; i++) {
            System.out.printf("Luas Tanah %d: %d\n", i+1, tanah[i].hitungLuas());
            if (tanah[i].hitungLuas() > terluas) {
                terluas = tanah[i].hitungLuas();
                tanahTerluas = "Tanah " + (i+1);
            }
        }
        System.out.println("\nTanah terluas: " + tanahTerluas);

        sc.close();
    }
}
