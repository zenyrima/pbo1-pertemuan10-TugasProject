package model;
import java.text.DecimalFormat;
import java.time.*;
public class pengunjung {
    // atribut
    String nama;
    int MPWP;
    int PKP;
    String No_kwitansi;
    String No_reff;
    String No_pol;
    String Type_motor;
    String mekanis;
    int diskon;
    int harga;
    int Qty;
    long item;
    int pajak;

    // constructor

    public pengunjung(String nama, int MPWP, int PKP, String no_kwitansi, String no_reff, String no_pol, String type_motor, String mekanis, int diskon, int harga, int qty, long item, int pajak) {
        this.nama = nama;
        this.MPWP = MPWP;
        this.PKP = PKP;
        this.No_kwitansi = no_kwitansi;
        this.No_reff = no_reff;
        this.No_pol = no_pol;
        this.Type_motor = type_motor;
        this.mekanis = mekanis;
        this.diskon = diskon;
        this.harga = harga;
        this.Qty = qty;
        this.item = item;
        this.pajak = pajak;
    }

    // hitung diskon
    long hitungdisko(){
        long diskon = 0;
            if (this.hitungdisko() >= 250000){
                diskon = 30000;
            } else {
                diskon = 0;
            }
            return diskon;
    }
    //method hitung jumlah pengunjung
    public long hitung(){
        long sum =(this.harga * this.Qty) * this.diskon;
        return sum;
    }

    //method total
    public long hitungtotal(){
        long sum =this.hitungtotal() - this.diskon;
          return sum;
    }
    //method pajak
    public long hitungpajak(){
        long sum =this.item * 1000;
    return sum;
    }


    // mencetak data pengunjung
    void printPengunjung(){
        System.out.println("nama   : " + this.nama);
        System.out.println("MPWP : " + this.MPWP);
        System.out.println("PKP     : " + this.PKP);
        System.out.println("No Kwitansi    : " + this.No_kwitansi);
        System.out.println("No reff   : " + this.No_reff);
        System.out.println("Type Motor   : " + this.Type_motor);
        System.out.println("Mekanis   : " + this.mekanis);
        System.out.println("Hitung Diskon   : Rp " + this.hitungdisko());
        System.out.println("Hitung jumlah   : Rp " + this.hitung());
        System.out.println("Jumlah pajak   : Rp " + this.hitungpajak());
    }
}



