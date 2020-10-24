class Lab538
{
public static void main(String args[])
{
System.out.println("Main begin");

try{
String str=args[0];
int x=Integer.parseInt(str);
int res=10/x;

System.out.println("Result:" +res);
}
catch(Throwable ex)
{
System.out.println("Hee ,provide Correct Input");
}
System.out.println("Main End");
}
}
