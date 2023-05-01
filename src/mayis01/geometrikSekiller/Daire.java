package mayis01.geometrikSekiller;

import java.util.Scanner;

public class Daire {
    Scanner scan = new Scanner(System.in);

    void cevre() {
        System.out.println("Dairenin yarıçapını giriniz: ");
        int r = scan.nextInt();
        System.out.println("Dairenin çevresi: " + (2 * 3.14 * r));
    }

    void alan() {
        System.out.println("Dairenin yarıçapını giriniz: ");
        int r = scan.nextInt();
        System.out.println("Dairenin alanı: " + (3.14 * r * r));
    }
}
