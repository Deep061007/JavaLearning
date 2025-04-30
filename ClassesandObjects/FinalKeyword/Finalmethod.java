class Calc
{
public final void add(int a,int b)
{
System.out.println(a+b);
}
}
class Finalmethod
{
public static void main(String [] args)
{
Calc obj = new Calc();
obj.add(100,10);
}
}