package mayis08;

import java.util.Scanner;

public class Anamenu {
    Scanner scan = new Scanner(System.in);
    OgrenciIslemleri ogrenciIslemleri;
    void menu() {
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n" +
                "\t SEÇİMİNİZ: ");
        char secim = scan.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {
                ogrenciIslemleri=new OgrenciIslemleri();
                ogrenciIslemleri.ogrenciMenu();
            }
            case '2': {
            }
            case 'Q': {
            }
        }
    }
}
