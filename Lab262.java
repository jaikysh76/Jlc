class Lab262
{
public static void main(String args[])
{
Student stu1=new Student(88,"Srinivas");
stu1.show();
Student stu2=new Student(99,"Dande");
stu2.show();
}
}

class Student
{
String sname;
int sid;
Student(int id,String sn)
{
System.out.println("Student 2-Arg Constructor");
sid=id;
sname=sn;
}
void show()
{
System.out.println(sid+ "\t" +sname);
}
}
