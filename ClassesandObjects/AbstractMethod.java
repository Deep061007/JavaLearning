abstract class cricket
{
public abstract void bowler();
public void batsman()
{
System.out.println("the batsman is batting");
}
}
class Match extends cricket
{
public void bowler()
{
System.out.println("The bowler is bowling");
}
}
public class AbstractMethod
{
public static void main(String [] args)
{
cricket obj = new Match();
obj.batsman();
obj.bowler();
}
}
