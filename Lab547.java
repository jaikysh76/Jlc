class Lab547
{
public static void main(String args[])
{
System.out.println("Main begin");

try{
int x=10/0;
System.out.println("Result:"+x);
}
catch(ArithmaticException ex)
{
System.out.println("Hello ,Provide correct value");
}
System.out.println("Hello Guys");
catch(Exception ex)
{
System.out.println("Hai,Provide Correct Value");
}
System.out.println("Main End");
}
}
