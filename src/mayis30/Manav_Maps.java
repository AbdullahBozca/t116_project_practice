package mayis30;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/*
       1. Adım : Ürün girişi yapılmalı
       2. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
       3. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
       4. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
       5. Adim : Alisveris bitince toplam odemesi gereken tutari goster.


       1. ürün = domates->10 TL
       2. ürün = muz->28 TL
       3. ürün = kiraz->40 TL
       4. ürün = şeftali->25 TL
    */
public class Manav_Maps {
    static int urunNo = 1;
    static Scanner scan = new Scanner(System.in);
    static Map<Integer, Map<String, Double>> urunler = new HashMap<>();
    static double tutar = 0;


    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.print("*****ŞAŞKIN BAKKAL*****\n" +
                "1. ÜRÜN GİRİŞİ\n" +
                "2. ALIŞVERİŞ\n" +
                "ÇIKIŞ YAPMAK İÇİN Q YA BASINIZ...\n" +
                "SEÇİMiNİZ: ");
        try {
            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    urunGirisi();
                }
                case 2: {
                    alisveris();
                }
                default:{
                    System.out.println("HATALI GİRİŞ YAPTINIZ....");
                    menu();
                }
            }

        } catch (InputMismatchException e) {
            char secim=scan.next().toUpperCase().charAt(0);
            if (secim=='Q'){
                System.out.println("ÖDENECEK TUTAR= "+ tutar);
                System.out.println("******GüLE GÜLE******");
                System.exit(0);
            }else {
                System.out.println("HATALI GİRİŞ YAPTINIZ...");
                menu();
            }
        }
    }

    private static void alisveris() {
        do {
            System.out.println("******ÜRÜN LİSTESİ******");
            for (Map.Entry<Integer, Map<String, Double>> each1 : urunler.entrySet()) {
                for (Map.Entry<String, Double> each2 : each1.getValue().entrySet()) {
                    System.out.println(each1.getKey() + ". ÜRÜN = " + each2.getKey() + "--> " + each2.getValue() + " TL");
                }
            }
            System.out.print("SEÇMEK İSTEDİĞİNİZ ÜRÜN KODUNU GİRİNİZ: ");
            int secim = scan.nextInt();
            System.out.print("MİKTARINI GİRİNİZ: ");
            double miktar = scan.nextDouble();

            for (Map.Entry<Integer, Map<String, Double>> each1 : urunler.entrySet()) {
                if (each1.getKey() == secim) {
                    for (Map.Entry<String, Double> each2 : each1.getValue().entrySet()) {
                        tutar += each2.getValue() * miktar;
                    }
                }
            }
            System.out.println("DEVAM ETMEK İÇİN E YE BASINIZ...");
        } while (scan.next().toUpperCase().charAt(0) == 'E');
        menu();
    }

    private static void urunGirisi() {
        Map<String, Double> urunOzellikleri = new HashMap<>();
        scan.nextLine();
        System.out.print("ÜRÜN ADINI GİRİNİZ: ");
        String ad = scan.nextLine();
        System.out.print("ÜRÜN FİYATINI GİRİNİZ: ");
        double fiyat = scan.nextDouble();
        urunOzellikleri.put(ad, fiyat);
        urunler.put(urunNo++, urunOzellikleri);
        menu();
    }
}
