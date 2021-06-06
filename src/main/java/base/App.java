/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Douglas Glover
 */
package base;
import java.util.Scanner;
/*
Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal.
Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get.
If there are leftovers, show the number of leftover pieces.

Example Output

How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the output so it handles pluralization properly, for example: "Each person gets 2 pieces of pizza." or "Each person gets 1 piece of pizza."
Handle the output for leftover pieces appropriately as well.
Create a variant of the program that prompts for the number of people and the number of pieces each person wants,
and calculate how many full pizzas you need to purchase.
 */
public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int people = myApp.getPeople();
        int pizzas = myApp.getPizzas();
        int slices = myApp.getSlices();
        myApp.pizzaMath(people, pizzas, slices);
    }
    int getPeople()
    {
        System.out.print("How many people? ");
        return in.nextInt();
    }
    int getPizzas()
    {
        System.out.print("How many pizzas do you have? ");
        return in.nextInt();
    }
    int getSlices()
    {
        System.out.print("How many slices per pizza? ");
        return in.nextInt();
    }
    void pizzaMath(int people, int pizzas, int slices)
    {
        int totalSlices = pizzas * slices;
        System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");

        int divisible = totalSlices - (totalSlices % people);
        int split = divisible / people;
        System.out.println("Each person gets " + split + " pieces of pizza.");

        int leftovers = totalSlices - divisible;
        System.out.print("There are " + leftovers + " leftover pieces.");
    }

}
