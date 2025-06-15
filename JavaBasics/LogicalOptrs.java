class LogicalOptrs
{
public static void main(String [] args)
{
int x = 10;
int y = 20;
int a = 30;
int b = 50;
boolean result;
result = x<y && a<b ; 
System.out.println(result);
result = x>y || a<b ; 
System.out.println(result);
result = !(a<b) ; 
System.out.println(result);
}
}
