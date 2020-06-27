class Lab294{
public static void main(String[] args) {
Hello h=new Hello();
// h.show(12);
byte b=12;
h.show(b);
h.show((byte)12);
}
}
class Hello{
void show(byte x){
System.out.println("show (byte)");
}
}

