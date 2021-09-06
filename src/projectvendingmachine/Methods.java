package projectvendingmachine;

import java.util.Scanner;

public class Methods {

    public double select(Products product) {
        System.out.println(product.toString());
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("lutfen almak istediginiz urunu giiriniz(1'den 10a mkadar)");
            product.setProductNum(scan.nextInt());
            if (product.getProductNum()<1||product.getProductNum()>10)
                System.out.println("lutfen gecerli urun giriniz");

        }while(product.getProductNum()<1||product.getProductNum()>10);
        return 0;
    }
}
