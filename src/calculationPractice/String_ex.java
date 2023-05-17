package calculationPractice;

public class String_ex {

	public static void main(String[] args) {
	String s= "Java is best language";
	if(s.contains("Javas")) {
		System.out.println("s is present");
	}
	else {
		System.out.println("s is absent");
	}
	
	if (s.indexOf("web")!=-1) {
		System.out.println("the string has web");
	}
	else {
		System.out.println("the string does not have web");
	}

	}

}
