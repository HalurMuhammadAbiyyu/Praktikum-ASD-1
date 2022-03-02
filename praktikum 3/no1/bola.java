package no1;

public class bola {
    int jari;
    bola(int r){
        jari = r;
    }
    double volume(){
        return (4/3)*3.14*jari*jari*jari;
    }
    double luasPermukaan(){
        return 4*3.14*(jari*jari);
    }
}
