class MyThread extends Thread
{
public void run()
{
Thread th=Thread.currentThread();
for(int i=1;i<=5;i++)
{
System.out.println("I am " +th.getName()+ "\t" +th.getState());

try{
Thread.sleep(1000);
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}//end of run()
}
class Lab592
{
public static void main(String args[]) throws Exception
{
MyThread th1 =new MyThread();
th1.start();

System.out.println(th1.getState());

Thread.sleep(1000);
System.out.println(th1.getState());
 
Thread.sleep(1000);
System.out.println(th1.getState());
}
}

