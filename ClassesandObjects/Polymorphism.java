class Laptop
{
public void show() {
System.out.println("This is a Laptop");
}
}
class Computer extends Laptop
{
public void show(){
System.out.println("This is a Computer");
}
}
class Mouse extends Computer
{
public void show(){
System.out.println("This is a Mouse");
}
}
public class Polymorphism
{
public static void main(String [] args)
{
Laptop obj = new Laptop();
obj.show();

obj = new Computer();
obj.show();

obj = new Mouse();
obj.show();
}
}