package projectvendingmachine;

import java.util.Scanner;

public class Runner {

    public static void  main(String[] args) {


        Products product = new Products();

        Methods methods = new Methods();
        double money= methods.money();
        System.out.println("Hesabinizda "+ money +" dollar var");
        product.setPrice(methods.select(product));
        methods.select(product);
        methods.balance(product.getPrice(),money,product);


    }

}
