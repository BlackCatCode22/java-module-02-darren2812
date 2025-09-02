// MadnessWithMethods.java
// dD 09/02/25

// importing the scanner
import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args){
        // creates the scanner and takes user input
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        // calls helloThere method
        helloThere(name);
        // prompts user for two integers
        System.out.println("Now enter two whole numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        // calls addTwoInts method
        addTwoInts(num1, num2);
    }

    static void helloThere(String aName){
        // concatenates string and prints out user's name
        System.out.println("Hello " + aName + "!");
    }

    static void addTwoInts(int first, int second){
        // concatenates string and prints the sum of two numbers
        System.out.println("The sum of the two numbers is " + (first + second));
    }
}
