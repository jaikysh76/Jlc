class MyThread extends Thread{
public MyThread()
{
super();
}
public MyThread(String tname)
{
super(tname);
}
public MyThread(ThreadGroup tgroup,String tname)
{
super(tgroup,tname);
}
public void run()
{
Thread th=Thread.currentThread();
for(int i=1;i<=5;i++)
{
System.out.println("I am " +th.getName());
try
{
Thread.sleep(1000);
}
catch(Exception ex)
{
System.out.println(ex);
}
}
} //end of run()
}
class Lab590
{
public static void main(String args[])
{
System.out.println("Main Begin");
Thread th =Thread.currentThread();
th.setPriority(1);

ThreadGroup jlcgroup =new ThreadGroup("JLC");

MyThread myth1 =new MyThread(jlcgroup,"A");
myth1.setPriority(2); //1 to 10
myth1.start();

MyThread myth2 =new MyThread(jlcgroup, "B");
myth2.setPriority(3);
myth2.start();

MyThread myth3 =new MyThread(jlcgroup, "C");
myth3.setPriority(4);
myth3.start();

MyThread myth4 =new MyThread("D");
myth4.setPriority(9);
//myth4.setPriority(99);
myth4.start();

MyThread myth5=new MyThread();
myth5.setPriority(7);
myth5.start();

System.out.println(myth1);
System.out.println(myth2);
System.out.println(myth3);
System.out.println(myth4);
System.out.println(myth5);
System.out.println(th);
}
}




