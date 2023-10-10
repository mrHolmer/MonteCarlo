import java.text.NumberFormat;
import java.util.Scanner;

public class Game {
    private Player player;
    private Coin coin;
    private NumberFormat formatter = NumberFormat.getCurrencyInstance();
    public Game(Player p, Coin c)
    {
        player = p;
        coin = c;
        play();
    }
    public Game()
    {
        coin = new Coin();
        intro();
        getPlayerInfo();
        menu();
//        getWager();
//        headsOrTails();
//        flip();
//        reportBalance();
    }
    public void play()
    {
        getWager();
        headsOrTails();
        flip();
        reportBalance();
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
        System.out.println("Hello, " + name + ". How much would you like to deposit?");
        player = new Player(name);
        s = new Scanner(System.in);
        player.addBalance(s.nextDouble());
        String balance = formatter.format(player.getBalance());
        System.out.println("Your balance is " + balance + ".");
        System.out.println();
    }
    public void menu()
    {
        System.out.println(
                        "How can I help you? \n" +
                        "1. Flip a coin \n" +
                        "2. Inspect Coin");
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine().toLowerCase();
        if(Integer.parseInt(choice)==1 || choice.indexOf("flip")>-1)
            flip();
        else
            if(Integer.parseInt(choice)==2 || choice.indexOf("inspect")>-1)
                inspect();
    }
    public void inspect()
    {
        System.out.println(
                "This coin has been flipped " + coin.getFlips() + " times. \n" +
                "It has landed heads " + coin.getHeads() + " times. \n" +
                "It has landed tails " + coin.getTails() + " times. \n" +
                "It has landed heads " + coin.getHeadsProportion() + " of the time. \n" +
                "It has landed tails " + coin.getTailsProportion() + " of the time. \n"
        ); 
    }
    public void getWager() {
        System.out.println("How much would you like to risk on a coin flip?");
        Scanner s = new Scanner(System.in);
        double wager = s.nextDouble();
        player.setWager(wager);
        if (wager > player.getBalance()) {
            System.out.println("I'm sorry.  You don't have sufficient funds for that wager.");
            getWager();
        }

    }
    public void headsOrTails() {
        System.out.println("Call it in the air.  Heads or tails?");
        Scanner s = new Scanner(System.in);
        player.setGuess(s.nextLine());
        if (!player.getGuess().equalsIgnoreCase("heads") && !player.getGuess().equalsIgnoreCase("tails")) {
            System.out.println("Please try again.");
            headsOrTails();
        }
    }
    public void flip()
    {
        headsOrTails();
        coin.flip();
        String wager = formatter.format(player.getWager());
        if(player.getGuess().equalsIgnoreCase("heads")) {
            player.addBalance(player.getWager());
            System.out.println("You won " + wager + ".");
        }
        else {
            player.addBalance(player.getWager()*-1);
            System.out.println("You lost " + wager + ".");
        }
    }
    public void reportBalance()
    {
        String balance = formatter.format(player.getBalance());
        System.out.println("Your balance is " + balance);
        if(player.getBalance() > 0)
        {
            play();
        }
        else gameOver();
    }
    public void gameOver()
    {
        System.out.println("Better luck next time, " + player.getName());
    }

}
