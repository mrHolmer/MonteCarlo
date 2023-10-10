public class Coin {
    private int flips;
    private int heads;
    private int tails;
    private boolean isHeads;
    public void flip()
    {
        heads++;
        flips++;
        isHeads = true;
        System.out.println("It's heads");
    }
    public int getHeads()
    {
        return heads;
    }
    public int getTails() { return tails; }
    public int getFlips() { return flips; }
    public void printHeads()
    {
        System.out.println("This coin has landed heads " + heads + " times.");
    }
    public double getTailsProportion()
    {
        return (double)tails/flips;
    }
    public double getHeadsProportion() { return (double)heads/flips; }
    public void printTailsProportion()
    {
        System.out.println("This coin has landed tails " + (int)(getTailsProportion()*100) + " percent of the time.");
    }
    public void heads()
    {
        heads++;
        flips++;
        System.out.println("It's heads");
    }

    public void tails(int f)
    {
        tails+=f;
        flips+=f;
        System.out.println("It was tails every time!");
    }
    public void tails()
    {
        tails++;
        flips++;
        System.out.println("It was tails every time!");
    }

}
