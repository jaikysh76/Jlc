class Lab233
{
public static void main(String args[])
{
Hello h1=new Hello();
Hello h2=new Hello();
System.out.println(h1.b+"\t"+h2.b);
h1.b=99;
System.out.println(h1.b+ "\t"+h2.b);
}
}
class Hello
{
static int b;
}


