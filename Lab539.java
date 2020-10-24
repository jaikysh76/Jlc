class Lab539
{
public static void main(String args[])
{
System.out.println("Main Begin");
try
{
String str=args[0];
int x=Integer.parseInt(str);
int res=10/x;
System.out.println("Result:"+res);
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("hee,provide the value");
}
catch(NumberFormatException ex)
{
System.out.println("Hello ,provide integer number only");
}
catch(ArithmeticException ex)
{
System.out.println("Hai ,donot provide Zero");
}
System.out.println("Main End");
}
}
 