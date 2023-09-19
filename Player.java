public class Player {
    private String name;
    private double balance;
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

}
