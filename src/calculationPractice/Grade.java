package calculationPractice;

public class Grade {

	public static void main(String[] args) {
		int score;
		
		score =87;
		
		if(score>=80) {
			System.out.println("distinction");
		}
		else if(score >=60) {
			System.out.println("first class");
		}
		else if (score>=50) {
			System.out.println("second class");
		}
		
		else if (score>=40) {
			System.out.println("third class");
		}
		else {
			System.out.println("failed");
		}
	}

}
