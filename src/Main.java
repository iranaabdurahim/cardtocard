import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name1 = "irana";
        byte age1 = 30;
        double money1 = 5000.00;

        String name2 = "gulya";
        byte age2 = 60;
        double money2 = 1000.00;

        Scanner sc = new Scanner(System.in);
        System.out.println("Pul kocurmesini edecek shexsin adini qeyd edin: ");
        String kime = sc.nextLine();

        System.out.println("Kocurmek istediyiniz mebleg (AZN): ");;
        double amount = sc.nextDouble();
        // Eziz bey, burda ne qeder calishdim shert ya loop daxil edim ki,
        // balansdan artiq mebleg daxil olanda xeberdarliq versin, alinmadi, bacarmadim

        switch (kime) {

            case "irana":
                System.out.println("Cari balansiniz: " + money1+"AZN");
                System.out.println("Balansinizdan cixan mebleg: " + amount+"AZN");
                System.out.println("Balansinizdaki qaliq: " + (money1-amount)+"AZN");
                break;
            case "gulya":
                System.out.println("Cari balansiniz: " + money2+"AZN");
                System.out.println("Balansinizdan cixan mebleg: " + amount+"AZN");
                System.out.println("Balansinizdaki qaliq: " + (money2-amount)+"AZN");
                break;
            default:
                System.exit(0);

        }
    }

}
