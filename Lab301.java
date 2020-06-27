class Lab301
{
public static void main(String arg[])
{
Hello h=new Hello();
byte b=20;
h.add(b,10);
h.add(b,b);
}
}
class Hello
{
void add(byte a,int b)
{
System.out.println("add(byte,int)");
}
}
