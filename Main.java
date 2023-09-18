import java.util.Scanner;
public class Main
  {
    public static void main(String[] args)
    {
      System.out.println();
      Coin coin = new Coin();
      Player one = new Player();
      System.out.println("Welcome to Monte Carlo!");
      System.out.println("Brought to you by Enrico Fermi and Stanislaw Ulam");
      System.out.println();

      System.out.println("What is your name?");
      Scanner s = new Scanner(System.in);
      one.setName(s.nextLine());
      System.out.println("Hello, " + one.getName() + ". How much would you like to risk?");
      s = new Scanner(System.in);
      one.addBalance(s.nextDouble());
      System.out.println("Your balance is $" + Format.money(one.getBalance()) + ".");
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
