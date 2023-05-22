package mayis22;

import java.util.Scanner;

public class Dikdortgen implements Iislemler{
    Scanner scan=new Scanner(System.in);
    static int kısaKenar,uzunKenar,cevreSonuc,alanSonuc;
    @Override
    public void cevre() {
        System.out.print("KISA KENAR UZUNLUĞUNU GİRİNİZ: ");
        kısaKenar=scan.nextInt();
        System.out.print("UZUN KENAR UZUNLUĞUNU GİRİNİZ: ");
        uzunKenar=scan.nextInt();
        cevreSonuc=2*(kısaKenar+uzunKenar);
        System.out.println("Dikdörtgenin çevresi: "+cevreSonuc);
    }

    @Override
    public void alan() {
        alanSonuc=kısaKenar*uzunKenar;
        System.out.println("Dikdörtgenin alanı: "+alanSonuc);
    }
}
