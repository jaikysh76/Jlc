class Lab545
{
public static void main(String args[])
{
System.out.println("Main Begin");

try{
int x=10/0;
System.out.println("Result:" +x);
}
catch(NumberFormatException ex)
{
System.out.println("Provide Correct Value");
}


System.out.println("Main End");
}
}
