package javaProject;

public class ArrayConcept {

	public static void main(String[] args) {
	
		int []arr= {1,5,7,9,9,10,12};
		//arr.length;
		System.out.println(arr.length);
		
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("xxxxxxxxxxxxxx");
		
		for(int value:  arr) {
			System.out.println(value);
		}
		
		System.out.println("yyyyyyyyyyyyyyyyyyy");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}

}
