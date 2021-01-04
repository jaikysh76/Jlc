class Lab585
{
public static void main(String args[])
{
Thread th=new Thread();
System.out.println(th);


System.out.println("-------------------------------------");

for(int i=0;i<=5;i++)
{
System.out.println("Val-" +i+ "by" +th.getName());

try{
Thread.sleep(1000);
}
catch(Exception ex)
{
System.out.println(ex);
}}}}
