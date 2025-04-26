class calc
{
public int add(int n1, int n2)
{
return n1+n2;
}
}
class Advcalc extends calc
{
public int add(int n1, int n2)
{
return n1+n2;
}
}
public class MethodOverriding
{
public static void main(String [] args)
{
Advcalc obj = new Advcalc();
int result = obj.add(10,20);
System.out.println(result);
}
}