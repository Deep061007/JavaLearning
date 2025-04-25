class Lamp
{
public void obj()
{
System.out.println("The Lamp is on");
}
}
class Book extends Lamp
{
public void obj1()
{
System.out.println("The Book is on the table ");
}
}
class Pen extends Book
{
public void obj2()
{
System.out.println("The Pen is on the table ");
}
}
public class Inheritance
{
public static void main(String [] args)
{
Pen p = new Pen();
p.obj();
p.obj1();
p.obj2();
}
}