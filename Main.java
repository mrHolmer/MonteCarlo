import java.util.Scanner;
public class Main
  {
    public static void main(String[] args)
    {
      System.out.println("Welcome to Monte Carlo!");
      System.out.println("Brought to you by Enrico Fermi and Stanislaw Ulam");
      System.out.println();

      System.out.println("What is your name?");
      Scanner s = new Scanner(System.in);
      String name = s.nextLine();
      System.out.println("Hello, " + name + ". Heads or tails?");
      s = new Scanner(System.in);
      String call = s.nextLine();
      System.out.println(call + ", eh?");
      System.out.println();

      final double probabilityOfHeads = 0.5;
      boolean isHeads = true;
      int numberOfHeads = 0;
      int numberOfTails = 0;
      System.out.println("The probability of a fair coin landing on heads is " + probabilityOfHeads + ".");
      System.out.println("The coin has landed heads " + numberOfHeads + " times.");
      System.out.println();

      System.out.println("How many times would you like to flip the coin?");
      int flips = s.nextInt();
      System.out.println("It was tails every time!");
      numberOfTails += flips; //compound assignment operator
      isHeads = false;
      System.out.println();

      System.out.println("I will now flip the coin again.");
      System.out.println("It was heads!");
      isHeads = true;
      numberOfHeads++; //increment operator
      System.out.println();

      System.out.println("The coin has landed heads " + numberOfHeads + " time.");
      double proportionOfTails = (numberOfTails)/(numberOfTails + numberOfHeads + 0.0); //compound expression
      System.out.println("The coin has landed tails " + proportionOfTails * 100 + " percent of the time.");


    }
  }
