package Collections;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProje {
    public static void main(String[] args) {
        /*1-kullanicidan bircok kimlik numarasini(4)haneli,tam ismini,adresini,telefonunu alin
        * 2-kimlik numarasini key olarak,diger bilgileri value olarak bir map'e depolayin
        * 3-kimlik numarasini girerek kullanicinin bilgilerine ulasin*/

        Scanner scan=new Scanner(System.in);
        String id="";

        HashMap<String,String> person=new HashMap<>();

        do{
            System.out.println("kimlik numarasini giriniz");
            System.out.println("bilgi girisini durdurmak icin 'Q'  tudsuna basiniz");
            id=scan.next();
            if (id.equals("Q")){
                break;
            }

            System.out.println("isminizi giriniz");
            String name1=scan.next();

            System.out.println("soy isminizi giriniz");
            String name2=scan.next();

            System.out.println("adresinizi giriniz");
            String adress=scan.next();

            System.out.println("telefon numaranizi 10 haneli olarak giriniz");
            String telNo=scan.nextLine();

            person.put(id,name1+" "+name2+ "/ " +adress+ "/ Q" +telNo);


        }while(!id.equals("Q"));

        System.out.println(person);

        //kimlik nu


    }
}
