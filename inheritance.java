import java.util.Scanner;

class EMp{
	int Eid;
	String name;
	String department;
	float Salary;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Enter your Id");
		int Eid = sc.nextInt();
		System.out.println("Enter your Department");
		String department = sc.next();
		System.out.println("Enter your Salary");
		float Salary = sc.nextFloat();
		
		System.out.println("Here is your Name"+ Eid);
		System.out.println("Here is your Name"+ name);
		System.out.println("Here is your department "+ department);
		System.out.println("Here is your Salary "+ Salary );
		
	}
	
	
}
class Teacher extends EMp{
	int id;
	String name;
	String department;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Enter your Id");
		int id = sc.nextInt();
		System.out.println("Enter your Department");
		String department = sc.next();
		
		System.out.println("Here is your Name"+ ""+ id);
		System.out.println("Here is your Name"+ name);
		System.out.println("Here is your department "+ department);
		
	}
	
	
}




public class inheritance {

	public static void main(String[] args) {
		inheritance in = new inheritance();
		 EMp e = new EMp();
		 e.input();
		 
		 Teacher t = new Teacher();
		 t.input();
		 

	}

}
