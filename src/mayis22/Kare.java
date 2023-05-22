package mayis22;

import java.util.Scanner;

public class Kare implements Iislemler{
    Scanner scan=new Scanner(System.in);
    static int kenar,cevreSonuc,alanSonuc;
    @Override
    public void cevre() {
        System.out.println("KARENİN KENAR UZUNLUĞUNU GİRİNİZ: ");
        kenar=scan.nextInt();
        cevreSonuc=kenar*4;
        System.out.println("Karenin çevresi: "+cevreSonuc);
    }

    @Override
    public void alan() {
        alanSonuc=kenar*kenar;
        System.out.println("Karenin alanı: "+alanSonuc);
    }
}
