import java.text.NumberFormat;
import java.util.Scanner;

public class Game {
    private Player player;
    private Coin coin;
    public Game(Player p, Coin c)
    {
        player = p;
        coin = c;

    }
    public Game()
    {
        intro();
        getPlayerInfo();
        flip();
    }
    public void intro()
    {
        System.out.println();
        System.out.println("Welcome to Monte Carlo!");
        System.out.println("Brought to you by Enrico Fermi and Stanislaw Ulam");
        System.out.println();
    }
    public void getPlayerInfo() {
        System.out.println("What is your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello, " + name + ". How much would you like to risk?");
        player = new Player(name);
        s = new Scanner(System.in);
        player.addBalance(s.nextDouble());
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String balance = formatter.format(player.getBalance());
        System.out.println("Your balance is " + balance + ".");
        System.out.println();
    }
    public void flip()
    {
        coin = new Coin();
        coin.flip();
    }

}
