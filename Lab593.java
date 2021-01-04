class AccountService
{
int bal=970;
public synchronized void withdraw(int amt)
{
Thread th=Thread.currentThread();
if(bal>amt)
{
System.out.println(th.getName() +"is gping to withdraw:" +bal);//1
try
{
Thread.sleep(1000);//2
}
catch(Exception ex)
{
System.out.println(ex);
}
bal=bal-amt;//3
System.out.println(th.getName()+ "has completed withdraw: "+bal);//4
}
else
{
System.out.println("Sorry,No Funds for" +th.getName());//5
}
}
public int getBal()
{
return bal;
}}

class AccountThread implements Runnable{
AccountService accService;
public AccountThread(AccountService accService){
this.accService= accService;
}
public void run(){
for(int i=1;i<=5;i++){
accService.withdraw(225);
if(accService.getBal()<0){
System.out.println("Amount is Overdrawn ");
}
}
} //end of run()
}
class Lab593{
public static void main(String as[]) throws
Exception{
AccountService accService = new AccountService();
Runnable runnable = new
AccountThread(accService);
Thread th1=new Thread(runnable,"Sri");
th1.start();
Thread th2=new Thread(runnable,"Vas");
th2.start();
}
} 

