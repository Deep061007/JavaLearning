class Student
{
int roll_no;
String name;
int marks;
}
public class Arrayofobjects
{
public static void main(String [] args)
{
Student S1 = new Student();
S1.roll_no = 1;
S1.name= "Deep";
S1.marks=99;
Student S2 = new Student();
S2.roll_no = 2;
S2.name = "Parth";
S2.marks = 89;
Student S3 = new Student();
S3.roll_no = 3;
S3.name = "Prayag";
S3.marks = 92;
Student Students[] = new Student[3];
Students[0] = S1;
Students[1] = S2;
Students[2] = S3;
for(int i = 0;i<Students.length;i++)
{
System.out.println(Students[i].roll_no + " : " + Students[i].name + " : " + Students[i].marks);
}
}
}