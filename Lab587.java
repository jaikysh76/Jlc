class MyThread implements Runnable{
public void run(){
Thread th=Thread.currentThread();
for(int i=1;i<=5;i++){
System.out.println(" Val - "+i+" by "+th.getName());
try{
Thread.sleep(1000);
}catch(Exception ex){
System.out.println(ex);
}
}
} //end of run()
}
class Lab587{
public static void main(String as[]){
Runnable runnable=new MyThread();
Thread th1=new Thread(runnable);
th1.start();
Thread th2=new Thread(runnable);
th2.start();
Thread th=Thread.currentThread();
for(int i=1;i<=5;i++){
System.out.println(" Hello Guys "+i +" by"+th.getName());
try{
Thread.sleep(1000);
}catch(Exception ex){
System.out.println(ex);
}
}
}
}