class Lab256{
public static void main(String args[]){
Hello h=new Hello();
System.out.println("Main :"+h.a);
}
}
class Hello{
 {
 int a=10;
 System.out.println("I. Block :"+a);
 }
static{
 int a=10;
 System.out.println("S. Block :"+a);
 }
}