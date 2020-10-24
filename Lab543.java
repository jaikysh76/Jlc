class Lab543
{
public static void main(String args[])
{
System.out.println("Main Begin");

try{
int x=10/0;
System.out.println("Result:" +x);
}catch(String ex)
{
System.out.println("Hee,provide the value");
}
System.out.println("Main End");
}
}
