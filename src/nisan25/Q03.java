package nisan25;

import java.util.Scanner;

public class Q03 {
    /*
    3. SORU
    Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
    Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
    Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
    Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.
     */
    //hello ----> ıfmmp --->1 birim kaydırılmış hali

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Şifrelenecek metni giriniz: ");
        String str = scan.nextLine().toUpperCase();
        System.out.print("Kaydırma aralığını giriniz: ");
        int kaydirma = scan.nextInt();

        sifrele(str, kaydirma);
    }

    public static void sifrele(String str, int kaydirma) {
        String sifrelenmisStr = "";
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < str.length(); i++) {
            char karakter = str.charAt(i);
            int karakterIndex = alfabe.indexOf(karakter); // karakter in alfabedeki indexini elde ettik. eğer harften başka bir değer girilirse indexof -1 değeri döndürür.
            if (karakterIndex >= 0) {
                int yeniIndex = (karakterIndex + kaydirma) % alfabe.length();
                sifrelenmisStr += alfabe.charAt(yeniIndex);
            } else {
                sifrelenmisStr += str.charAt(i);
            }
        }
        System.out.println("Metnin şifrelenmiş hali: " + sifrelenmisStr);
    }
}
