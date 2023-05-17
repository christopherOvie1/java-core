package javaProject;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		ArrayToArrayList vin = new ArrayToArrayList();
	String names =	vin.getDsata();
	System.out.println(names);
	String []name= {"john","mike","ken","dan"};
	List<String> nameOfArray=Arrays.asList(name);
	nameOfArray.contains("john");
	
	
	String s= "bun  and james";
	String[] k=s.split("and");
	//System.out.println(k[1]);
	for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i));
	}
		System.out.println("ssssssssssss");	

		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}
	public String getDsata() {
		System.out.println("hello world");
		return "john";
	}

}
