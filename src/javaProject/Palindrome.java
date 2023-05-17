package javaProject;

public class Palindrome {

	public static void main(String[] args) {
		String x= "a,b,c,d,c,b,a";
		
	int i= 0; int j= x.length()-1;
	
	while(i<j) {
		
	if(x.charAt(i)!=x.charAt(j)) {
		System.out.println("not a palindrome");
	}
	i++;
	j--;
	
	}
	System.out.println("palindrome");

	}

}
