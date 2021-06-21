package model;
public class main {
    public static void main(String[] args) {

        pengunjung p1 = new pengunjung(
        );
        p1.setNama("Zeny");
        p1.setMPWP(3);
        p1.setNo_kwitansi("02");
        p1.setNo_reff("001");
        p1.setNo_pol("DA1092");
        p1.setType_motor("matic");
        p1.setMekanis("Renal");
        p1.setDiskon(30000);
        p1.setHarga(7000);
        p1.setQty(02);
        p1.setItem(1);
        p1.setPajak(1000);
        p1.printPengunjung();
        pengunjung p3 = new pengunjung("Jl.Biman Villa gang bhakti Rt 01", "081334251679");
        pengunjung p4 = new pengunjung();

        pengunjung p5 = new pengunjung();
        p5.setNama("Nuril");
        p5.setMPWP(4);
        p5.setNo_kwitansi("50");
        p5.setNo_reff("313");
        p5.setNo_pol("DA1354");
        p5.setType_motor("matic");
        p5.setMekanis("agus");
        p5.setDiskon(30000);
        p5.setHarga(70000);
        p5.setQty(02);
        p5.setItem(2);
        p5.setPajak(1000);
        p5.printPengunjung();
        pengunjung p6= new pengunjung("Jl.soekarno hatta", "081233251679");
        pengunjung p7 = new pengunjung();
        // contoh obyek data member
    member p2= new member();
        p2.setNama("Rina");
        p2.setMPWP(5);
        p2.setNo_kwitansi("50");
        p2.setNo_reff("313");
        p2.setNo_pol("DA1354");
        p2.setType_motor("matic");
        p2.setMekanis("sholikin");
        p2.setDiskon(30000);
        p2.setHarga(70000);
        p2.setQty(01);
        p2.setItem(2);
        p2.setPajak(1000);
        p2.setId_member("908");
        p2.setNo_member("9110");
        p2.setMasa_berlaku("s/d 2025");
    p2.printmember();

    }
}