import java.util.Random;
import java.util.Scanner;

public class ESP {

    public static void main(String[] args){

        int num;
        String computer_Color;
        int count = 0;
        int correct = 0;
        String user_Color;

        Scanner keyboard = new Scanner(System.in);


        for(int i = 0; i <=5 ; i++)
        {
            num = random.nextInt(3)+1;

            if(num == 1)
            {
                computer_Color = "Red";
            }
            else if (num == 2){
                computer_Color = "GREEN";
            }
            else if (num == 3){
                computer_Color = "YELLOW";
            }
            System.out.println("I'm thinking of a color.");
            System.out.print("Is it red, green, or yellow? ");

            
            keyboard = user_Color.nextLine().toLowerCase();
            System.out.print("Computer's choice: " + computer_Color);

            computer_Color = computer_Color.toLowerCase();

            
            //compares computer's color choice to user guess and
            if (user_Color.equalsIgnoreCase(computer_Color))
            {correct++;}

            count++;
        }

        System.out.println("Number of correct guesses: " + count);


    }
    

//userGuess() : returns the color the user has selected.
public static void userGuess() {
    System.out.println("In method userGuess");

    //equations

    System.out.println("leaving method userGuess");
  }


//number2Color(?) : map integer to color (string)
public static void number2Color() {
    System.out.println("In method number2Color");

    //equations

    System.out.println("leaving method number2Color");
  }

//isValidColor(?) : check if user input a valid color (string), used in userGuess() method.
public static void isValidColor() {
    System.out.println("In method isValidColor");

    //equations

    System.out.println("leaving method isValidColor");
  }


}
