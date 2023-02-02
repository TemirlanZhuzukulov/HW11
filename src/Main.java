import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

            System.out.println("""
                    тил танданыз
                    Кыргыз тили 1
                    Русский язык 2
                    English 3""");
        int s = scanner.nextInt();
            switch (s){

                case 1:
                    System.out.println("""
                            Кийинки функцияны танданыз
                            накталай алуу-1
                            картага акча салуу - 2
                            Айбеке акча которуу - 3
                            Абылайга акча которуу - 4""");
                    break;
                case 2:
                    System.out.println("""
                            Выберите следующую функцию
                               снятие наличных- 1
                               положить деньги на карту - 2
                               Перевод денег  Айбеку - 3
                               Денежный перевод Абылаю - 4"" """);
                    break;
                case 3:
                    System.out.println("""
                            Select next function
                               cash withdrawal - 1
                               put money on the card - 2
                               Money transfer to Aibek - 3
                               Money transfer to Abylai - 4"" ""\"""");
                    System.out.println("Aibektin akchasy:"+account.balance1);
                    System.out.println("Abylaidyn akchasy:"+account.balance2);
        }
        while (true){
            int r=scanner.nextInt();
            switch (r){
                case 2:
                    System.out.println("Канча акча салгыныз келет?");
                    int sc = scanner.nextInt();
                    account.deposit(sc);
                    break;
                case 1:
                    System.out.println("Канча акча снимайтекиниз келет?");
                    int scan= scanner.nextInt();
                    account.withdrawal(scan);
                    break;
                case 3:
                    perevod1();

                    break;
                case 4:
                    perevod2();
                    break;
                default:
                    System.out.println("myndai funcion jok");
            }
        }


    }

    public static void perevod1() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Канча сом которгунуз келет Айбеке?");
        double resl = scanner.nextInt();
        double res = account.balance2 - resl;
        System.out.println("popolnenie:" + resl);
        double otv = account.balance1+resl;
        System.out.println("Dostupno:" + otv);
        System.out.println("Aibektin akchasy:"+otv);

    }

    public static void perevod2() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Канча сом которгунуз келет Абылайга?");
        double sc = scanner.nextDouble();
        double res = account.balance1 - sc;
        System.out.println("popolnenie:" + sc);
        double resl = account.balance1 + sc;
        System.out.println("Dostupno:" + resl);
        System.out.println("Abylaidyn akchasy:" + resl);
    }
        }


