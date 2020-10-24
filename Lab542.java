class Lab542{
public static void main(String as[]){
System.out.println("Main Begin");
try{
String str= as[0];
int x=Integer.parseInt(str);
int res=10/x;
System.out.println("Result : "+res);
}catch(ArrayIndexOutOfBoundsException ex){
System.out.println("Heee, Provide the Value");
}
catch(NumberFormatException ex){
System.out.println("Hello, Provide Integer number only");
}
catch(Exception ex){
System.out.println("Hai, Provide Correct Input");
}
System.out.println("Main End");
}
} 
