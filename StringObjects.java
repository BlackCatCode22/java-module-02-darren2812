// importing the scanner
import java.util.Scanner;

public class StringObjects {
    public static void main(String[] args){
        // asks the user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        // assigns user input to the string words
        String words = input.nextLine();
        // outputs the substring until the first space and converts it to upper case letters
        System.out.println("This is the first word CAPITALIZED: "
                            + (words.substring(0, words.indexOf(" "))).toUpperCase());
    }
}
