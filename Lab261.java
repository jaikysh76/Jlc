class Lab261
{
public static void main(String args[])
{
Student stu=new Student();
stu.sid=99;
stu.sname="Srinivas";
stu.show();
}
}
class Student
{
int sid;
String sname;
Student()
{
System.out.println("Student Default constructor");
}
void show()
{
System.out.println(sid+ "\t"+sname);
}
}

