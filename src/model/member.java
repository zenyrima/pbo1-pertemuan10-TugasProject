package model;
import java.time.*;
import java.util.Set;

public class member extends pengunjung {
    // atribut tambahan untuk member
    private String id_member;
    private String No_member;
    private String masa_berlaku;

    // constructor
    public member(){
        this.id_member = id_member;
        this.No_member = No_member;
        this.masa_berlaku = masa_berlaku;

    }
    public member(String nama, int MPWP, int PKP, String no_kwitansi, String no_reff,
                      String no_pol, String type_motor, String mekanis,
                      int diskon, int harga, int qty, int item, int pajak,String id_member,
                      String No_member, String masa_berlaku)
    {
        setNama(nama);
        setMPWP(MPWP);
        setNo_kwitansi(no_kwitansi);
        setNo_reff(no_reff);
        setNo_pol(no_pol);
        setType_motor(type_motor);
        setMekanis(mekanis);
        setDiskon(diskon);
        setHarga(harga);
        setQty(qty);
        setItem(item);
        setPajak(pajak);
    }

    // menghitung member
    long hitungmember() {
        long member = 30000;
        return member;
    }

    // menghitung voucher tambahan
    long hitungvoucher() {
        long hitungvoucher;
        if (this.hitungvoucher() >= 100000) {
            hitungvoucher = 20000;
        } else {
            hitungvoucher = 0;
        }

        return hitungvoucher;
    }

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    public String getNo_member() {
        return No_member;
    }

    public void setNo_member(String no_member) {
        No_member = no_member;
    }

    public String getMasa_berlaku() {
        return masa_berlaku;
    }

    public void setMasa_berlaku(String masa_berlaku) {
        this.masa_berlaku = masa_berlaku;
    }

    // cetak data member
    void printmember() {
        System.out.println("nama   : " + this.getNama());
        System.out.println("MPWP : " + this.getMPWP());
        System.out.println("PKP     : " + this.getPKP());
        System.out.println("No Kwitansi    : " + this.getNo_kwitansi());
        System.out.println("No reff   : " + this.getNo_reff());
        System.out.println("Type Motor   : " + this.getType_motor());
        System.out.println("Mekanis   : " + this.getMekanis());
        System.out.println("Hitung Diskon   : Rp " + this.hitungdiskon());
        System.out.println("Hitung jumlah   : Rp " + this.hitung());
        System.out.println("Jumlah pajak   : Rp " + this.hitungpajak());
        System.out.println("ID Member   : " + this.id_member);
        System.out.println("No Member : " + this.No_member);
        System.out.println("Masa Berlaku     : " + this.masa_berlaku);
    }
}