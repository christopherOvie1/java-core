package calculationPractice;

public class DrivingLogic {

	public static void main(String[] args) {

		String gender= "Male";
		int age =55;
		if(age>=18 && gender =="Male") {
			System.out.println("valid for driving license");
		}
		
		else if (age >=18 && gender=="Female") {
			System.out.println("Valid for driving license");
		}
		else {
			System.out.println("not valid license");
		}
		

	}

}
