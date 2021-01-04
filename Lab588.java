class MyThread extends Thread
{
public MyThread()
{
super(); //Thread()
}
public MyThread(String tname)
{
super(tname);//Thread(String)
}
public void run()
{
Thread th=Thread.currentThread();
for(int i=0;i<=5;i++)
{
System.out.println("Val - " +i+ "by" +th.getName());
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
class Lab588
{
public static void main(String args[])
{
System.out.println("Main Begin");
MyThread myth1 =new MyThread("A");
myth1.start();
MyThread myth2=new MyThread("B");
myth2.start();
MyThread myth3 =new MyThread();
myth3.start();

System.out.println(myth1); //[A,5,main]
System.out.println(myth2);//[B,5,main]
System.out.println(myth3);//[Thread-0,main]
System.out.println("Main End");
}
}
