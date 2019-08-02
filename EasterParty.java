import java.util.Scanner;


public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());
        double buget = Double.parseDouble(scanner.nextLine());
        double cakePrice = buget * 0.10;
        if (guests >=10 && guests <= 15) {
            pricePerPerson *= 0.85;
        } else if (guests > 15 && guests <= 20) {
            pricePerPerson *= 0.80;
        } else if (guests > 20){
            pricePerPerson *= 0.75;
        }

        double totalPrice = guests * pricePerPerson + cakePrice;

        if (totalPrice >= buget) {
            System.out.printf("No party! %.2f leva needed.", totalPrice - buget);
        } else {
            System.out.printf("It is party time! %.2f leva left.", buget - totalPrice);
        }
    }
}
