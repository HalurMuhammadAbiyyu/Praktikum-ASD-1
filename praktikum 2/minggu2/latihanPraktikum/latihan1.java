package latihanPraktikum;

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


    
    
    
}

   


