import java.util.Scanner;

public class JustinChallisAssign1B {
        public static void main(String[] args) {
            System.out.println("Enter the price of the purchase): ");
            Scanner keyboard = new Scanner(System.in);

            float n1;

            n1 = keyboard.nextFloat();


            while (n1 <= 0);

            float dollars = 100 -n1;
            float twenties = 0;
            float tens = 0;
            float fives = 0;
            float toonies = 0;
            float loonies = 0;
            float quarters = 0;
            float dimes = 0;
            float nickels = 0;
            float pennies = 0;

            while(dollars - 20 >= 0)
            {
                dollars = dollars - 20;
                twenties++;
            }
            while(dollars - 10 >= 0)
            {
                dollars = dollars - 10;
                tens++;
            }
            while(dollars - 5 >= 0)
            {
                dollars = dollars - 5;
                fives++;
            }
            while(dollars - 2 >= 0)
            {
                dollars = dollars - 2;
                toonies++;
            }
            while(dollars - 1 >= 0)
            {
                dollars = dollars - 1;
                loonies++;
            }
            while(dollars - 0.25 >= 0)
            {
                dollars = dollars - 25;
                quarters++;
            }
            while(dollars - 0.10 >= 0)
            {
                dollars = dollars - 10;
                dimes++;
            }
            while(dollars - 0.05 >= 0)
            {
                dollars = dollars - 5;
                nickels++;
            }
            while(dollars - 0.01 >= 0)
            {
                dollars = dollars - 1;
                pennies++;
            }

            float coinsCount = quarters + dimes + nickels + pennies;

            System.out.println("The Change from $100 is " + (100 - n1));
            System.out.println("The number of twenties is " + twenties);
            System.out.println("The number of tens is " + tens);
            System.out.println("The number of fives is " + fives);
            System.out.println("The number of toonies is " + toonies);
            System.out.println("The number of loonies is " + loonies);
            System.out.println("The number of quarters is " + quarters);
            System.out.println("The number of dimes is " + dimes);
            System.out.println("The number of nickels is " + nickels);
            System.out.println("The number of pennies is " + pennies);
            System.out.println("The total number of coins is " + coinsCount);
        }
    }
