package no1;

public class kubus {
    public int sisi;

    kubus(int s){
        sisi = s;
    }

    int volume(){
        return sisi*sisi*sisi;
    }
    
    int luasPermukaan(){
        return 6*(sisi*sisi);
    }
}
