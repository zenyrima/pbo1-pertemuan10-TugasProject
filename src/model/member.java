package model;
import java.time.*;
public class member {
    // atribut tambahan untuk member
    String id_member;
    String No_member;
    String masa_berlaku;

    // constructor
    public member(String nama, int MPWP, int PKP, String no_kwitansi, String no_reff, String no_pol, String type_motor, String mekanis, int diskon, int harga, int qty, int item, int pajak, String id_member, String no_member, String masa_berlaku){
        super();

        this.id_member = id_member;
        this.No_member = no_member;
        this.masa_berlaku = masa_berlaku;
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

    // cetak data member
    void printmember() {
        System.out.println("ID Member   : " + this.id_member);
        System.out.println("No Member : " + this.No_member);
        System.out.println("Masa Berlaku     : " + this.masa_berlaku);
    }
}