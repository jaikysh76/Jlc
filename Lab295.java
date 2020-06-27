class Lab295
{
public static void main(String args[])
{
Hello h=new Hello();
//h.show(65);
h.show('A');
h.show((char)65);
}
}
class Hello
{
void show(char x)
{
System.out.println("show(char)");
}
}