class Calculator
{
int a;
int b;
public Calculator()
{
a = 10;
b = 20;
}
public int getsum(){
return a+b;
}
}
public class Constructor
{
public static void main(String [] args)
{
Calculator obj = new Calculator();
System.out.println("The sum is : " + obj.getsum());
}
}

