package mayis08;

import java.util.Scanner;

public class Anamenu {
    Scanner scan = new Scanner(System.in);
    OgrenciIslemleri ogrenciIslemleri;
    OgretmenIslemleri ogretmenIslemleri;
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
                ogretmenIslemleri=new OgretmenIslemleri();
                ogretmenIslemleri.ogretmenMenu();
            }
            case 'Q': {
                System.out.println("GÜLE GÜLE");
                System.exit(0);
            }
            default:{
                System.out.println("HATALI GİRİŞ YAPTINIZ...");
                menu();
            }
        }
    }
}
