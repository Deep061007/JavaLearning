class trycatch
{
public static void main(String [] args)
{
int i = 10;
int j = 0;
try{
int k = i/j;
System.out.println(k);
}
catch(Exception e){
System.out.println("the Exception is handled");
}
System.out.println("Now the code will run");
}
}
