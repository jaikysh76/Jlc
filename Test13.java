class Test13
{
public static void main(String args[])
{
System.out.println(Hello.a);
}
}


class Hello
{
static int a=10;
Hello()
{
System.out.println("CONS");
}
static
{
System.out.println("SB");
}

}
