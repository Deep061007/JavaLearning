class Mobile
{
public void show()
{
System.out.println("This is a Mobile");
}
class TV 
{
public void show1()
{
System.out.println("This is a TV");
}
}
}
public class Innerclass
{
public static void main(String [] args)
{
Mobile obj = new Mobile();
obj.show();
Mobile.TV obj1 = obj.new TV();
obj1.show1();
}
}