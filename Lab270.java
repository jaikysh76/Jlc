class Lab270
{
public static void main(String rags[])
{
Student stu1=new Student(88,"Srinivas");
stu1.show();

Student stu2=new Student(99,"Dande");
stu2.show();
 }
}
class Student
{
int sid;
String sname;
Student(int sid,String sname)
{
System.out.println("Student 2-Arg Constructor");
sid=sid;
sname=sname;
}
void show(){
System.out.println(sid+ "\t"+sname);
}}
