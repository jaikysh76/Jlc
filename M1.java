class M1
{
	boolean b1;
	byte b2;
	short s;
	int a;
	long b;
	float f;
        double d;
	String str;
        M1 h;
	void show()	
	{
		System.out.println(b1);
 		System.out.println(b2);
    		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(str);
		System.out.println(h);
         }
}
class M2
{
  public static void main(String[] args)
  {
   M1 h=new M1();
   h.show();
}
}
		
    