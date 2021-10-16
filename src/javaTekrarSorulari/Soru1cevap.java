package javaTekrarSorulari;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

        /*
    1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

    Test Data
    34
    Beklenen Çıktı
    7
    */

        Scanner scan=new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi=scan.nextInt();

        int toplam=11;

        while (toplam>10){

            toplam=0;

            while (sayi>0){
                toplam+=sayi%10;

                sayi/=10;
            }

            if (toplam>9){
                sayi=toplam;
            }


        }

        System.out.println("girilen sayinin sayi degerleri toplami= " + toplam);
    }
}
