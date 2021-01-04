class MyThread extends Thread{
public void run(){
Thread th=Thread.currentThread();
for(int i=1;i<=5;i++){
System.out.println("Val-" +i+ "by" +th.getName());
try{
Thread.sleep(1000);
}catch(Exception ex){
System.out.println(ex);
}
}
} //end of run()
}
class Lab586{
public static void main(String as[]){
MyThread myth1=new MyThread();
myth1.start();
MyThread myth2=new MyThread();
myth2.start();
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