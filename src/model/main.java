package model;
public class main {
    public static void main(String[] args) {

        pengunjung p1 = new pengunjung("ZENY", 0, 0,
                "0230", "WOR-W/HSU01/21891", "DA1819", "MATIC",
                "ANDI LUKMANA", 30000, 400000, 2, 1,
                1000);
        p1.printPengunjung();
        // contoh obyek data member
    member p2= new member("anjanni", 2, 4, "028", "876",
            "DA9870", "matic", "AHMAD SAIDI", 20000, 750000,
            2, 1, 1000, "0918", "0981", "S/D 2024");
    p2.printmember();
    }
}