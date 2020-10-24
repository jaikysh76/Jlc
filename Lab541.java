class Lab541{
public static void main(String as[]){
System.out.println("Main Begin");
try{
String str= as[0];
int x=Integer.parseInt(str);
int res=10/x;
System.out.println("Result : "+res);
}catch(Exception ex){
System.out.println("Hai, Provide Correct Input");
}
catch(ArrayIndexOutOfBoundsException ex){
System.out.println("Heee, Provide the Value");
}
catch(NumberFormatException ex){
System.out.println("Hello, Provide Integer number only");
}
System.out.println("Main End");
} }