class Mobile
{
String brand;
static int price;
String Model;
public void show()
{
System.out.println(brand + ":" +price + ":" +Model );
}
}
public class Staticvariable
{
public static void main(String [] args)
{
Mobile obj1 = new Mobile();
obj1.brand = "Vivo";
Mobile.price = 22000;
obj1.Model = "VivoV23";
Mobile obj2 = new Mobile();
obj2.brand = "Samsung";
Mobile.price = 25000;
obj2.Model = "SamsungS24";
obj1.price = 30000;
obj1.show();
obj2.show();
}
}

