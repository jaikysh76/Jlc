class Lab548
{
public static void main(String args[])
{
System.out.println("Main Begin");
System.out.println("-----------1---------");

String str="";

try{
str=args[0];  //A
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("Heee,Provide the value");
}
System.out.println("------------2-----------");

int x=0;
try{
x=Integer.parseInt(str); //B
}
catch(NumberFormatException ex)
{
System.out.println("Hello,Provide Integer number Only");
}
System.out.println("-----------3--------------");
try
{
int res=10/x; //C

System.out.println("Hai,provide Correct Input");
}catch(ArithmeticException ex)
{
System.out.println("Hai,Provide Correct Input");
}

System.out.println("Main End");
}
}




 