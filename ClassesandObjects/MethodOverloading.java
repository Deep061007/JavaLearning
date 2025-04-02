class Calculator 
{
public int sum(int n1 , int n2)
{
return n1+n2;
}
public int sum(int n1 , int n2 , int n3)
{
return n1+n2+n3;
}
}
public class MethodOverloading
{
public static void main(String [] args)
{
Calculator obj = new Calculator();
int result = obj.sum(10,20,30);
System.out.println(result);
}
}