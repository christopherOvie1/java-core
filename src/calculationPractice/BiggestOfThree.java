package calculationPractice;

public class BiggestOfThree {

	public static void main(String[] args) {
		int x,y,z;
		
		x=6;
		y=8;
		z=10;
		
		if(x>y &&x>z) {
			System.out.println(x+ "is biggest");
		}
		else if(y>x&&y>z) {
			System.out.println(y+"is biggest");
		}
		else if (z>x&&z>x) {
			System.out.println(z + "is bogggest");
		}
		else {
			System.out.println("none is biggest");
		}

	}

}
