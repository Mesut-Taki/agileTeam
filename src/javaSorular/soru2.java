package javaSorular;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
           /*Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        *  Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50*/

        Scanner scan=new Scanner(System.in);

        int carpilansayi=1;
        do {
            System.out.println("lutfen yapmak istediginiz islemi seciniz\n1-Toplama\n2-Cikarma\n3-Bolme\n4-Carpma\n5-Cikis");


            int islem= scan.nextInt();

            if (islem==5){
                cikis();
                break;
            }
            switch (islem){
                case 1:{
                    toplama();
                    break;
                }
                case 2:{
                    cikarma();
                    break;
                }
                case 3:{
                    bolme();
                    break;
                }
                case 4:{
                    carpma();
                    break;
                }
                case 5:{
                    cikis();
                    break;
                }
            }

        }while(true);
    }

    private static void cikis() {
        System.out.println("hayirli gunler dileriz");

    }

    private static void carpma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen carpimini sitediginiz bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("hangi sayiya kadar carpilacagini giriniz");
        int carpimEnd = scan.nextInt();


        int carpilansayi = 1;
        do {
            for (int i = 1; i <= carpimEnd; i++) {
                System.out.println(sayi + (" * ") + i + (" = ") + sayi * i);

            }

        } while (carpilansayi < 1);
    }

    private static void bolme() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bolunmesini sitediginiz bir sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println("hangi sayiya kadar bolunecegini giriniz");
        int bolumEnd= scan.nextInt();


        int bolunenSayi=1;
        do {
            for (int i = 1; i <=bolumEnd; i++) {
                System.out.println(sayi+(" / ")+i+(" = ")+sayi/i);

            }

        }while(bolunenSayi<1);

    }

    private static void cikarma() {
        Scanner scan=new Scanner(System.in);
        System.out.println("cikarilacak sayiyi giriniz");
        int sayi= scan.nextInt();
        System.out.println("hangi sayiya kadar cikarma islemi yapilacagini giriniz");
        int cikarmaEnd= scan.nextInt();
        int cikarilanSayi=0;
        for (int i = 0; i <=cikarmaEnd ; i++) {
            System.out.println(sayi+(" - ")+i+(" = ")+(sayi-i));
        }
    }

    private static void toplama() {
        Scanner scan=new Scanner(System.in);
        System.out.println("toplanacak sayiyi giriniz");
        int sayi= scan.nextInt();
        System.out.println("hangi sayiya kadar toplanacagini giriniz");
        int toplaEnd= scan.nextInt();
        int toplananSayi=0;
        for (int i = 0; i <=toplaEnd ; i++) {
            System.out.println(sayi+(" + ")+i+(" = ")+(sayi+i));
        }
    }
}
