import java.util.Scanner;

public class Account {
    int balance1 = 1000;
    double balance2 = 2000;

    void deposit(double plus){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Канча акча салгыныз келет?");
        double p = balance1+plus;
        System.out.println("popolnena:"+plus+"kgz");
        System.out.println("dospuno:"+p+"kgz");

    }
    void withdrawal(double minus){
        double m = balance1-minus;
        System.out.println("vydacha nalichnykh:"+minus+"KGZ");
        System.out.println("Dostupno:"+m+"KGZ");

    }

}
