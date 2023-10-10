public class Player {
    private String name;
    private double balance;
    private double wager;
    private String guess;
    public Player(String s)
    {
        name = s;
    }

    public void setName(String s)
    {
        name = s;
    }
    public String getName()
    {
        return name;
    } //accessor
    public void addBalance(double n)
    {
        balance += n;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getWager()
    {
        return wager;
    }
    public void setWager(double w)
    {
        wager = w;
    }
    public void setGuess(String g)
    {
        guess = g;
    }
    public String getGuess()
    {
        return guess;
    }

}
