class MyThread implements Runnable
{
public void run()
{
Thread th=Thread.currentThread();
for(int i=1;i<=5;i++)
{
System.out.println("Val -" +i+ "by" +th.getName());
try
{
Thread.sleep(1000);
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}//end run()
}
class Lab589
{
public static void main(String args[])
{
System.out.println("Main Begin");
Runnable runnable =new MyThread();

Thread th1=new Thread(runnable, " A ");
th1.start();

Thread th2=new Thread(runnable," B ");
th2.start();

Thread th3=new Thread(runnable," C ");
th3.start();

System.out.println(th1);
System.out.println(th2);
System.out.println(th3);
System.out.println("Main End");
}
}
