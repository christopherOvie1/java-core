package calculationPractice;

public class ConditionalStringForTwo {

	public static void main(String[] args) {
		String x = "web";
		String y = "web";
		if(x==y) {
			System.out.println("correct");
		}
		if(x.equals(y)) {
			System.out.println("also correct");
		}
		//String s1= "web";
		//String s2= "web";
		
		
		String s1= new String("webs");
		String s2= new String("web");
		if(s1==s2) {
			System.out.println("very correct");
		}
		else
		{
		System.out.println("wrong");	
		}
		if(s1.equals(s2)) {
			System.out.println("another very correct");
		}
		else
		{
		System.out.println("very wrong");	
		}
		
		}
	}


