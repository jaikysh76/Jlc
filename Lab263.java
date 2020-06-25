class Lab263
{
public static void main(String args[])
{
Student stu1=new Student(99,"Sri","sri@jlc",99999);
stu1.show();
Student stu2=new Student(88,"vas","vas@jlc");
stu2.show();
Student stu3=new Student(77,"SD");
stu3.show();
Student stu4=new Student();
stu1.show();
}
}

class Student
{
int sid;
String sname;
String email;
long phone;
Student(int id,String sn,String em,long ph)
{
System.out.println("Student 4-Arg constructor");
sid=id;
sname=sn;
email=em;
phone=ph;
}
Student(int id,String sn,String em)
{
System.out.println("Student 3-Arg constructor");
sid=id;
sname=sn;
email=em;
}
Student(int id,String sn)
{
System.out.println("Student 2-Arg constructor");
sid=id;
sname=sn;
}
Student()
{
System.out.println("Student default constructor");
}
void show()
{
System.out.println(sid+ "\t" +sname+ "\t"+email+ "\t" +phone);
}
}



