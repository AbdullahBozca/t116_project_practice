package mayis01.geometrikSekiller;

import java.util.Scanner;

public class Diktdortgen {
    Scanner scan=new Scanner(System.in);
    void cevre(){
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        int kKenar=scan.nextInt();
        System.out.print("Uzun kenar uzunluğunu giriniz: ");
        int uKenar=scan.nextInt();
        System.out.println("Dikdörtgenin çevresi: "+2*(kKenar+uKenar));
    }
    void alan(){
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        int kKenar=scan.nextInt();
        System.out.print("Uzun kenar uzunluğunu giriniz: ");
        int uKenar=scan.nextInt();
        System.out.println("Dikdörtgenin alanı: "+(kKenar*uKenar));
    }
}
