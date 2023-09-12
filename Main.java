public class Main
  {
    public static void main(String[] args)
    {
      System.out.println("Welcome to Monte Carlo!");
      System.out.println("Brought to you by Enrico Fermi and Stanislaw Ulam");
      System.out.println();
      final double probabilityOfHeads = 0.5;
      boolean isHeads = true;
      int numberOfHeads = 0;
      System.out.println("The probability of a fair coin landing on heads is " + probabilityOfHeads + ".");
      System.out.println("The coin has landed heads " + numberOfHeads + " times.");
      System.out.println();
      System.out.println("I will now flip the coin.");
      System.out.println("It's tails!");
      isHeads = false;
      System.out.println();
      System.out.println("I will now flip the coin again.");
      System.out.println("It's heads!");
      isHeads = true;
      numberOfHeads = numberOfHeads + 1;
      System.out.println();
      System.out.println("The coin has landed heads " + numberOfHeads + " times.");

    }
  }
