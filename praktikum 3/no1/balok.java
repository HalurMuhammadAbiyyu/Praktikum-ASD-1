package no1;

public class balok {
    int panjang, lebar, tinggi;

    balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    int volumeBalok(){
        return panjang*lebar*tinggi;
    }
    int luasPermukaanBalok(){
        return 2*(panjang*lebar+panjang*tinggi+panjang*tinggi);
    }
}
