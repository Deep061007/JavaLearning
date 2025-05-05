interface January
{
void show();
}
class February implements January
{
public void show()
{
System.out.println("This month is January");
}
}
public class Interface
{
public static void main(String[] args)
{
January obj = new February();
obj.show();
}
}