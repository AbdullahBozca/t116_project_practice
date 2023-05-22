package mayis22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("HESAPLAMAK İSTEDİĞİNİZ GEOMETRİK ŞEKLİ SEÇİNİZ: \n" +
                "1. DİKDÖRTGEN\n" +
                "2. KARE\n" +
                "3. DAİRE\n" +
                "ÇIKIŞ İÇİN Q HARFİNE BASINIZ...");
        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{
                    Dikdortgen dikdortgen=new Dikdortgen();
                    dikdortgen.cevre();
                    dikdortgen.alan();
                    menu();
                }
                case 2:{
                    Kare kare=new Kare();
                    kare.cevre();
                    kare.alan();
                    menu();
                }
                case 3:{
                    Daire daire=new Daire();
                    daire.cevre();
                    daire.alan();
                    menu();
                }
                default:{
                    System.out.println("HATALI SAYI GİRDİNİZ...");
                    menu();
                }

            }

        }catch (InputMismatchException e){
            char secim=scan.next().toUpperCase().charAt(0);
            if (secim=='Q'){
                System.out.println("ÇIKIŞ YAPILIYOR...");
                System.exit(0);
            }else {
                System.out.println("HATALI GİRİŞ YAPTINIZ...");
                menu();
            }
        }
    }
}
