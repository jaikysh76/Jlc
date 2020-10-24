class Lab546
{
public static void main(String args[])
{
System.out.println("Main Begin");

try{
int x=10/0;
System.out.println("Result:" +x);
}

System.out.println("Hello Guys");
catch(ArithmaticException ex)
{
System.out.println("provide correct value");
}
System.out.println("Main End");
}
}
