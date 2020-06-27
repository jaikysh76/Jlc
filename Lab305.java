class Lab305
{
public static void main(String args[])
{
Hello h=new Hello();
h.show("jlc");
h.show(h);
//h.show(null);
}
}
class Hello
{
void show(String str)
{
System.out.println("show(String)");
}
void show(Hello str)
{
System.out.println("show(Hello)");
}
}
