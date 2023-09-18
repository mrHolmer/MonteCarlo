public class Player {
    private String name;
    private double balance;
    public void setName(String s)
    {
        name = s;
    }
    public String getName()
    {
        return name;
    }
    public void addBalance(double n)
    {
        balance += n;
    }
    public double getBalance()
    {
        return balance;
    }

}
