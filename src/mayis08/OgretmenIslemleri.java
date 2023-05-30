package mayis08;

import java.util.ArrayList;
import java.util.Scanner;

public class OgretmenIslemleri  {
    Scanner scan = new Scanner(System.in);
    static ArrayList<Ogretmen> ogretmenList = new ArrayList<>();

    void ogretmenMenu() {
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
                Anamenu anamenu=new Anamenu();
                anamenu.menu();
            }
            default:{
                System.out.println("HATALI GİRİŞ YAPTINIZ...");
                ogretmenMenu();
            }
        }
    }

    private void silme() {
        System.out.print("SİLİNECEK KİŞİNİN TCNO SUNU GİRİNİZ: ");
        String tcNo= scan.next();
        int flag=0;
        for (int i = 0; i < ogretmenList.size(); i++) {
            if (tcNo.equals(ogretmenList.get(i).getTcNo())){
                System.out.println("SİLİNECEK ÖĞRETMENİN BİLGİLERİ: "+ ogretmenList.get(i).toString());
                ogretmenList.remove(i);
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println("ARADIĞINIZ KİŞİ YOKTUR...");
            ogretmenMenu();
        }
        ogretmenMenu();
    }

    private void arama() {
        System.out.print("ARANACAK KİŞİNİN TCNO SUNU GRİNİZ: ");
        String tcNo = scan.next();
        boolean flag = true;
        for (Ogretmen each : ogretmenList) {
            if (tcNo.equals(each.getTcNo())) {
                System.out.println("ARADIĞINIZ KİŞİNİN BİLGİLERİ: " + each.toString());
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("ARADIĞINIZ KİŞİ YOKTUR...");
            ogretmenMenu();
        }
        ogretmenMenu();
    }

    private void listeleme() {
        for (Ogretmen each : ogretmenList) {
            System.out.println(each.toString());
        }
        ogretmenMenu();
    }

    private void ekleme() {
        scan.nextLine();
        System.out.print("ÖĞRETMENİN ADINI GİRİNİZ: ");
        String ad = scan.nextLine();
        System.out.print("ÖĞRETMENİN SOYADINI GİRİNİZ: ");
        String sAd = scan.nextLine();
        System.out.print("ÖĞRETMENİN TCNO SUNU GİRİNİZ: ");
        String tcNo = scan.next();
        System.out.print("ÖĞRETMENİN YAŞINI GİRİNİZ: ");
        int yas = scan.nextInt();
        scan.nextLine();
        System.out.print("ÖĞRETMENİN BÖLÜMÜNÜ GİRİNİZ: ");
        String bolum = scan.nextLine();
        System.out.print("ÖĞRETMENİN SİCİL NO SUNU GİRİNİZ: ");
        int sicilNo = scan.nextInt();
        Ogretmen ogretmen = new Ogretmen(ad, sAd, tcNo, yas, bolum, sicilNo);

        ogretmenList.add(ogretmen);
        listeleme();
    }
}
