class Lab283
{
public static void main(String args[])
{
Hello h=new Hello();
int a=h.show(10);
System.out.println(a);
System.out.println(h.show(10));
h.show(10);
System.out.println("Hello Guys");
}
}
class Hello
{
int show(int x)
{
return x+1;
}
}