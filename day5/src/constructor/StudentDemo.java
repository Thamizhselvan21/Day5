package constructor;

 class Student {
	int id;
	String sname;
	String Course;
	Student()//Default constructor
	{
		id=100;
		sname="tns Student";
		Course="JFS";
	}
	Student(int id,String sname)//parameterized constructor1
	{
		this.id=id;
		this.sname=sname;
	}
	Student(int id,String sname,String Course)//parameterized constructor2
	{
		this.id=id;
		this.sname=sname;
		this.Course=Course;
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s= new Student();//invoke the default constructor
		System.out.println(s.id+" "+s.sname+" "+s.Course);
		
		Student s1= new Student(112,"Raja");//invoke two parameter constructor
		System.out.println(s1.id+" "+s1.sname+" "+s.Course);

		Student s2= new Student(112,"Raja","Python");//invoke three parameter constructor
		System.out.println(s2.id+" "+s2.sname+" "+s2.Course);
	}

}
