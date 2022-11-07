package project0923;
class Person{
	String name;
	int getAge(int a) {
		if(a>10000) {
			return 20+2020-(a/100); }
		else
			return 2020-a;	
}}
	
class Student extends Person{
	int sid;
	int getGrade() {
		return sid-202000;
	}
}
	
class Professor extends Person{
	int pid;
	int getPayment()
	{return pid*10000; }
}
public class Assosiation0923 {

	public static void main(String[] args) {
	Student s1=new Student();
	Professor p1=new Professor();
	s1.name="홍길동"; // 객체.변수="변수에넣을값"  메소드 없이 값넣을수있네
	s1.sid=2020001;
	System.out.println("Student name : "+ s1.name +"Student ID : "+ s1.sid);
	System.out.println("Student Age : "+ s1.getAge(s1.sid)+"Student Grade : "
				+ s1.getGrade());
	p1.name="한교수";
	p1.pid=1970;
	System.out.println("Professor name : " +p1.name+  "Professor ID :" + p1.pid);
	System.out.println("Professor Age : " +p1.getAge(p1.pid)+ "Professor Payment :"+
	p1.getPayment());
	}
	

}


