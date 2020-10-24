class Lab549
{
public static void main(String args[])
{
System.out.println("Main Begin");

try{
String str=args[0];
int x=Integer.parseInt(str);
int res=10/x;
System.out.println("Result:" +res);
}
catch(ArrayIndexOutOfBoundsException |NumberFormatException |ArithmeticException ex)
{
System.out.println("Heee,Provide the value");
}

System.out.println("Main End");
}
}
