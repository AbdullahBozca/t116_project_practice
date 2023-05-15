package mayis08;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciIslemleri {
    Scanner scan = new Scanner(System.in);
    static ArrayList<Ogrenci> ogrenciList = new ArrayList();

    void ogrenciMenu() {
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        char secim = scan.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {
                ekleme();
            }
            case '2': {
                arama();
            }
            case '3': {
                listeleme();
            }
            case '4': {
                silme();
            }
            case 'Q': {
                Anamenu anamenu = new Anamenu();
                anamenu.menu();
            }
            default: {
                System.out.println("HATALI GİRİŞ YAPTINIZ...");
                ogrenciMenu();
            }
        }
    }

    private void silme() {
        //kimlik no ile silme ve arama
        System.out.print("SİLİNECEK ÖĞRENCİNİN TCNO SUNU GİRİNİZ: ");
        String tcNo = scan.next();
        boolean flag = false;
        for (int i = 0; i < ogrenciList.size(); i++) {
            if (tcNo.equals(ogrenciList.get(i).getTcNo())) {
                System.out.println("SİLİNECEK ÖĞRENCİNİN BİLGİLERİ: " + ogrenciList.get(i).toString());
                ogrenciList.remove(i);
                flag = true;
                break;
            }
        }
        if (!flag) { // bu if bloğunun çalışabilmesi için false değeri gelmeli
            System.out.println(tcNo + " YA AİT VERİ BULMAMAKTADIR...");
            listeleme();
        }
        ogrenciMenu();
    }

    private void arama() {
        //kimlik no ile silme ve arama
        System.out.println("ARANACAK ÖĞRENCİNİN TCNO SUNU GİRİNİZ: ");
        String tcNo = scan.next();
        int flag = 0;
        for (Ogrenci each : ogrenciList) {
            if (each.getTcNo().equals(tcNo)) {
                System.out.println("ARADIĞINIZ ÖĞRENCİ= " + each);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("ARADIĞINIZ ÖĞRENCİ YOKTUR");
            ogrenciMenu();
        }
        ogrenciMenu();
    }

    private void listeleme() {
        for (Ogrenci each : ogrenciList) {
            System.out.println(each);
        }
        ogrenciMenu();
    }

    private void ekleme() {
        //Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf
        scan.nextLine();
        System.out.println("ÖĞRENCİNİN ADINI GİRİNİZ: ");
        String ad = scan.nextLine();
        System.out.println("ÖĞRENCİNİN SOYADINI GİRİNİZ: ");
        String sad = scan.nextLine();
        System.out.println("ÖĞRENCİNİN TCNO GİRİNİZ: ");
        String tcNo = scan.nextLine();
        System.out.println("ÖĞRENCİNİN YAŞINI GİRİNİZ: ");
        int yas = scan.nextInt();
        System.out.println("ÖĞRENCİNİN NUMARA GİRİNİZ: ");
        int numara = scan.nextInt();
        System.out.println("ÖĞRENCİNİN SINIFINI GİRİNİZ: ");
        String sinif = scan.next();
        Ogrenci ogrenci = new Ogrenci(ad, sad, tcNo, yas, numara, sinif);
        ogrenciList.add(ogrenci);

        listeleme();

    }
}
