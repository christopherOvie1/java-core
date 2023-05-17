package javaProject;

public class MethodOverLoadinhWithExample {

	
	//note operation ids same but behaviour is different
	public void printSal(int salary) {
		System.out.println("salary without bonus :"+salary);
	}

	
public void printSal(int salary, double bonus) {
		System.out.println("salary wt bonus" +(salary +bonus));
	}

public static void main(String[] args) {
	MethodOverLoadinhWithExample obj= new MethodOverLoadinhWithExample();
	obj.printSal(3000);
	obj.printSal(5000, 20000);

}

}
