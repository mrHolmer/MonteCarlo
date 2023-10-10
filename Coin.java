public class Coin {
    private int flips;
    private int heads;
    private int tails;
    private boolean isHeads;
    public void flip()
    {
        flips++;
        if(Math.random()<0.5) {
            isHeads = true;
            heads++;
            //System.out.println("It's heads.");
        }
        else
        {
            isHeads = false;
            tails++;
            //System.out.println("It's tails.");
        }
    }
    public void flip(int flips)
    {
        for(int i = 0; i < flips; i++) flip();
    }
    public void maxFlip()
    {
        flip(Integer.MAX_VALUE);
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
    public void inspect()
    {
        System.out.println(
                "This coin has been flipped " + flips + " times. \n" +
                        "It has landed heads " + heads + " times. \n" +
                        "It has landed tails " + tails + " times. \n" +
                        "It has landed heads " + getHeadsProportion() + " of the time. \n" +
                        "It has landed tails " + getTailsProportion() + " of the time. \n"
        );
    }

}
