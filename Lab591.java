class MyThread implements Runnable
{
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
}// end of run()
}
class Lab591{
public static void main(String as[]){
System.out.println("Main Begin");
Thread th=Thread.currentThread();
th.setPriority(1);
Runnable runnable=new MyThread();
ThreadGroup jlcgroup=new ThreadGroup("JLC");
Thread th1=new Thread(jlcgroup,runnable,"A");
th1.setPriority(2); // 1 to 10
th1.start();
Thread th2=new Thread(jlcgroup,runnable,"B");
th2.setPriority(4);
th2.start();
Thread th3=new Thread(jlcgroup,runnable,"C");
th3.setPriority(6);
th3.start();
Thread th4=new Thread(runnable,"D");
th4.setPriority(9);
th4.start();
Thread th5=new Thread(runnable);
th5.setPriority(7);
th5.start();
System.out.println(th1);
System.out.println(th2);
System.out.println(th3);
System.out.println(th4);
System.out.println(th5);
System.out.println(th);
}
}