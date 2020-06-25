class Lab265 {
public static void main(String[] args) {
Student stu=new Student();
stu.Student(77, "SD");
stu.show();
// Student st1=new Student(88, "MK");
}
}
class Student{
 int sid;
 String sname;
void Student(int id, String sn){
 System.out.println("Student 2-Arg Constructor");
 sid=id;
 sname=sn;
}
Student(){
 System.out.println("Student Default Constructor");
}
void show(){
System.out.println(sid+"\t"+sname);
}
}