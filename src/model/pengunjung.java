package model;
import java.text.DecimalFormat;
import java.time.*;
public class pengunjung {
    // atribut
    private String nama;
    private int MPWP;
    private int PKP;
    private String No_kwitansi;
    private String No_reff;
    private String No_pol;
    private String Type_motor;
    private String mekanis;
    private int diskon;
    private int harga;
    private int Qty;
    private int item;
    private int pajak;
    private String alamat;
    private String no_telp;


    // constructor

    public pengunjung(String nama, int MPWP, int PKP, String no_kwitansi, String no_reff, String no_pol, String type_motor, String mekanis, int diskon, int harga, int qty, int item, int pajak) {
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
    //construktor 2


    public pengunjung(String alamat, String no_telp) {
        this.alamat = alamat;
        this.no_telp = no_telp;
    System.out.println("Alamat anda " + this.alamat);
    System.out.println("No Telpon anda " + this.no_telp);

    }
    //construktor 3
    public pengunjung() {
        System.out.println("Terima Kasih atas Kepercayaan anda");
    }

    // hitung diskon
    long hitungdiskon(){
        long diskon = 0;
            if (this.diskon >= 250000){
                diskon = 30000;
            } else {
                diskon = 0;
            }
            return diskon;
    }
    //method hitung jumlah pengunjung
    public long hitung(){
        long a =this.harga * this.Qty;
        long b = a * this.diskon;
        return b;
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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getMPWP() {
        return MPWP;
    }

    public void setMPWP(int MPWP) {
        this.MPWP = MPWP;
    }

    public int getPKP() {
        return PKP;
    }

    public void setPKP(int PKP) {
        this.PKP = PKP;
    }

    public String getNo_kwitansi() {
        return No_kwitansi;
    }

    public void setNo_kwitansi(String no_kwitansi) {
        No_kwitansi = no_kwitansi;
    }

    public String getNo_reff() {
        return No_reff;
    }

    public void setNo_reff(String no_reff) {
        No_reff = no_reff;
    }

    public String getNo_pol() {
        return No_pol;
    }

    public void setNo_pol(String no_pol) {
        No_pol = no_pol;
    }

    public String getType_motor() {
        return Type_motor;
    }

    public void setType_motor(String type_motor) {
        Type_motor = type_motor;
    }

    public String getMekanis() {
        return mekanis;
    }

    public void setMekanis(String mekanis) {
        this.mekanis = mekanis;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getPajak() {
        return pajak;
    }

    public void setPajak(int pajak) {
        this.pajak = pajak;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    // mencetak data pengunjung
    public void printPengunjung(){
        System.out.println("nama   : " + this.nama);
        System.out.println("MPWP : " + this.MPWP);
        System.out.println("PKP     : " + this.PKP);
        System.out.println("No Kwitansi    : " + this.No_kwitansi);
        System.out.println("No reff   : " + this.No_reff);
        System.out.println("Type Motor   : " + this.Type_motor);
        System.out.println("Mekanis   : " + this.mekanis);
        System.out.println("Hitung Diskon   : Rp " + this.hitungdiskon());
        System.out.println("Hitung jumlah   : Rp " + this.hitung());
        System.out.println("Jumlah pajak   : Rp " + this.hitungpajak());
    }
}



