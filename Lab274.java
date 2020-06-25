class Lab274
{
public static void main(String args[])
{
Hello h=null;
//h.show();   //NPE
h=new Hello();
h.show();
//Hello.show();

}
}
class Hello
{
void show()
{
System.out.println("instance show()");
}
}