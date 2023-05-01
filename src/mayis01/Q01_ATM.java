package mayis01;

import java.util.Scanner;

public class Q01_ATM {
    /*
    ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.


Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.

Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */
    static Scanner scan = new Scanner(System.in);
    static String kartNo = "123456";
    static String sifre = "1234";
    static double bakiye = 50000;

    public static void main(String[] args) {
        giris();
    }

    private static void giris() {
        //ATM
        //Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        //Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        //Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


        System.out.print("KART NUMARASI GİRİNİZ: ");
        String kKartNo = scan.nextLine().replace(" ", "");
        System.out.print("ŞİFRE GİRİNİZ: ");
        String kSifre = scan.next();
        if (kKartNo.equals(kartNo) && kSifre.equals(sifre)) { // kKartNo==kartNo---> BU ŞRKİLDE STRİNG İFADELERİ KARŞILAŞTIRMAK İSTERSEK, BU İFADELERİN
            //REFERANS DEĞERLERİNİ KARŞILAŞTIRMIŞ OLURUZ..
            menu();
        }else {
            System.out.println("HATALI GİRİŞ YAPTINIZ...");
            scan.nextLine();// DUMMY
            giris();
        }
    }

    private static void menu() {
        //Menu listesinde
        // Bakiye sorgula,
        // para yatirma,
        // para çekme,
        // para gönderme,
        // sifre değiştirme ve
        // cikis islemleri olacaktır.
        System.out.println("****** JAVA BANK ******\n" +
                "1. BAKİYE SORGULAMA\n" +
                "2. PARA YATIRMA\n" +
                "3. PARA ÇEKME\n" +
                "4. PARA GONDERME\n" +
                "5. ŞİFRE DEĞİŞTİRME\n" +
                "6. ÇIKIŞ");
        int secim = scan.nextInt();//char //String
        switch (secim) {
            case 1: {
                bakiyeSorgula();
            } //case '1'  // "1"
            case 2: {
                System.out.print("YATIRALACAK MİKTARI GİRİNİZ: ");
                                                //double miktar=scan.nextDouble();
                paraYatirma(scan.nextDouble());//paraYatirma(miktar);
            }
            case 3: {
                paraCekme();
            }
            case 4: {
                paraGonderme();
            }
            case 5: {
                sifreDegistirme();
            }
            case 6: {
                System.out.println("BİZİ SEÇTİĞİNİZ İÇİN TEŞEKKÜRLER...");
                System.exit(0); // DERLEYİCİ BU SATIRA GELDİĞİNDE ÇALIŞMAYI BİTİRİR...
            }
        }
    }

    public static void sifreDegistirme() {
        //Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
        System.out.print("ESKİ ŞİFREYİ GİRİNİZ: ");
        String eSifre=scan.next();
        if (eSifre.equals(sifre)){
            System.out.print("YENİ ŞİFREYİ GİRİNİZ: ");
            sifre=scan.next();
            scan.nextLine();//dummy
            giris();
        }else {
            System.out.println("HATALI GİRİŞ YAPTINIZ...");
            sifreDegistirme();
        }

    }


     static void paraGonderme() {
        //Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        scan.nextLine(); //dummy metodu
        System.out.print("İBAN GİRİNİZ: ");
        String iban=scan.nextLine().toUpperCase().replace(" ", "");
        if (iban.length()==26 && iban.startsWith("TR")){
            System.out.print("GÖNDERİLECEK MİKTARI GİRİNİZ: ");
            double miktar=scan.nextDouble();
            if (bakiye>=miktar){
                bakiye-=miktar;
                bakiyeSorgula();
            }else {
                System.out.println("GÖNDERMEK İSTEDİĞİNİZ MİKTARDA BAKİYEYE SAHİP DEĞİLSİNİZ...");
                menu();
            }
        }else {
            System.out.println("HATALI İBAN GİRİŞİ YAPTINIZ...");
            menu();
        }
    }

    private static void paraCekme() {
        //Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        System.out.print("ÇEKİLECEK MİKTARI GİRİNİZ: ");
        double miktar=scan.nextDouble();
        if (bakiye>=miktar){
            bakiye-=miktar;
            bakiyeSorgula();
        }else {
            System.out.println("ÇEKMEK İSTEDİĞİN MİKTARDA BAKİYEYE SAHİP DEĞİLSİNİZ...");
            menu();
        }

    }

    private static void paraYatirma(double miktar) {
        bakiye+=miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("BAKİYENİZ: " + bakiye);
        System.out.println();
        menu();
    }
}
