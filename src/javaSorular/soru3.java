package javaSorular;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen carpimini sitediginiz bir sayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(sayi+(" * ")+i+(" = ")+sayi*i);

        }
    }
}
