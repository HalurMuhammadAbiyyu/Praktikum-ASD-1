package no1;

import java.util.Scanner;

import javax.swing.Box;

public class bangunRuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan banyak kubus : ");
        int k = sc.nextInt();
        int s; 
        kubus [] kubusArray = new kubus[k];
        for(int i = 0; i < kubusArray.length; i++){
            System.out.println("masukkan sisi ke-" + (i+1) + " : " );
            s = sc.nextInt();
            kubusArray[i] = new kubus(s);
        }
        for(int i = 0; i < kubusArray.length; i++){
            System.out.println();
            System.out.println("Kubus ke-" + (i+1));
            System.out.println("Sisi : " + kubusArray[i].sisi);
            System.out.println("Volume ke-" + (i+1) + " : " + kubusArray[i].volume());
            System.out.println("Luas permukaan ke-" + (i+1) + " : " + kubusArray[i].luasPermukaan());
        }
        System.out.println();
        System.out.println("Masukkan banyak bola : ");
        int bl = sc.nextInt();
        int r2; 
        bola[] bolaArray = new bola[bl];
        for(int i = 0; i < bolaArray.length; i++){
            System.out.println("masukkan jari jari ke-" + (i+1) + " : " );
            r2 = sc.nextInt();
            bolaArray[i] = new bola(r2);
        }
        for(int i = 0; i < kubusArray.length; i++){
            System.out.println();
            System.out.println("bola ke-" + (i+1));
            System.out.println("jari jari : " + bolaArray[i].jari);
            System.out.println("Volume ke-" + (i+1) + " : " + bolaArray[i].volume());
            System.out.println("Luas permukaan ke-" + (i+1) + " : " + bolaArray[i].luasPermukaan());
        }
        System.out.println();
        System.out.println("Masukkan banyak balok : ");
        int blk = sc.nextInt();
        int p;
        int l;
        int t; 
        balok [] balokArray = new balok[blk];
        for(int i = 0; i < balokArray.length; i++){
            System.out.println("masukkan panjang ke-" + (i+1) + " : " );
            p = sc.nextInt();
            System.out.println("masukkan lebar ke-" + (i+1) + " : " );
            l = sc.nextInt();
            System.out.println("masukkan tinggi ke-" + (i+1) + " : " );
            t = sc.nextInt();
            balokArray[i] = new balok(p, l,t);
        
        }
        for(int i = 0; i < balokArray.length; i++){
            System.out.println();
            System.out.println("Balok ke-" + (i+1));
            System.out.println("panjang : " + balokArray[i].panjang);
            System.out.println("lebar : " + balokArray[i].lebar);
            System.out.println("tinggi : " + balokArray[i].tinggi);
            System.out.println("Volume ke-" + (i+1) + " : " + balokArray[i].volumeBalok());
            System.out.println("Luas permukaan ke-" + (i+1) + " : " + balokArray[i].luasPermukaanBalok());
        }


    }
}
