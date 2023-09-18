import java.util.Scanner;
public class Main
  {
    public static void main(String[] args)
    {
      Coin coin = new Coin();

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

      coin.flip();
      System.out.println();

      System.out.println("How many times would you like to flip the coin?");
      int flips = s.nextInt();
      coin.tails(flips);
      System.out.println();

      coin.printTailsProportion();
    }
  }
