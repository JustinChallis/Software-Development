import java.util.Scanner;

public class JustinChallisA {
    public static void main(String[] args) {
        System.out.println("Enter the price of the purchase in cents ($1 or less): ");
        Scanner keyboard = new Scanner(System.in);

        int n1;
        n1 = keyboard.nextInt();


        while (n1 <= 0);

        int cents = 100 - n1;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        while(cents - 25 >= 0)
        {
            cents = cents - 25;
            quarters++;
        }
        while(cents - 10 >= 0)
        {
            cents = cents - 10;
            dimes++;
        }
        while(cents - 5 >= 0)
        {
            cents = cents - 5;
            nickels++;
        }
        while(cents - 1 >= 0)
        {
            cents = cents - 1;
            pennies++;
        }
        int coinsCount = quarters + dimes + nickels + pennies;

        System.out.println("The Change from $1.00 is " + (100 - n1));
        System.out.println("The number of quarters is " + quarters);
        System.out.println("The number of dimes is " + dimes);
        System.out.println("The number of nickels is " + nickels);
        System.out.println("The number of pennies is " + pennies);
        System.out.println("The total number of coins is " + coinsCount);
    }
}