class Lab293
{
public static void main(String args[])
{
Hello h=new Hello();
//System.out.println(h.show());
//System.out.println(h.show(10,20));
System.out.println(h.show(10));
}
}
class Hello
{
int show(int x)
{
System.out.println("show()");
return x+1;
}
}
