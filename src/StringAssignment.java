//Importing scanner utility
import java.util.Scanner;

//Declaring class
public class StringAssignment {
    //Declaring main method
    public static void main(String[] args){
        //Prompting user to enter name
        System.out.println("Please enter in your name: ");
        //Adding necessary component for using Scanner utility
        Scanner keyboard = new Scanner(System.in);
        //Defines user's next line of input as String variable yourName
        String yourName = keyboard.nextLine();
        //Displays yourName on console
        System.out.println(yourName);

    }
}