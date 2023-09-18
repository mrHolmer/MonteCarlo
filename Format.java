public class Format {
    public static String money(double n)
    {
       String s = "" + n;
       return s.substring(0,s.indexOf(".")+2);
    }
}
