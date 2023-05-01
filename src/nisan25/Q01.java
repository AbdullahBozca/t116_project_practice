package nisan25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    /*
    1. SORU
    Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
        Örnek: 12 = 1 1 0 0
     */
    public static void main(String[] args) {
        System.out.println("BIR SAYI GİRİNİZ: ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        System.out.println("GİRİLEN İFADENİN BİNARY KARŞILIGI: " + binaryConvert(sayi));
    }

    public static List<Integer> binaryConvert(int sayi) {
        List<Integer> binaryList = new ArrayList<>();
        while (sayi >= 1) {
            binaryList.add(sayi % 2);
            sayi /= 2;   //sayi=sayi/2;
        }//0 0 1 1
        //Collections.reverse(binaryList);
        List<Integer> tersBinaryList = new ArrayList<>();
        for (int i = binaryList.size() - 1; i >= 0; i--) { // for loop 3 ten başlayacak binaryListin son indexi
            tersBinaryList.add(binaryList.get(i));
        }
        return tersBinaryList;
    }
}
