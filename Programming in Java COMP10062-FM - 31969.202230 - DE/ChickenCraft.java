package Assignment2;

/**
 * Chicken Craft initial game design and implementation not using graphics
 * @author Justin Challis Student Number 001137680
 */

import java.util.Scanner;


public class ChickenCraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Chicken chicken1 = new Chicken();

        Chicken chicken2 = new Chicken();
        chicken2.setName("Bill");



        Chicken chicken3 = new Chicken();
        chicken3.setName("Jimmy");


        System.out.println(chicken1);
        System.out.println(chicken2);
        System.out.println(chicken3);


        System.out.println("1. Feed, 2. Play, 3. Hit, 4. Get Eggs, 5 Quit: ");
        int choice = sc.nextInt();

        if (choice == 1);
        feed();

        System.out.println("Choice: " + choice);




        System.out.println("Which Chicken?: ");



    }


}
