package mypackage;

public class String_Manipulation {

	public static void main(String[] args) {
		String str1= "Hello World";
		String str2= new String("Hello");
		String str3= new String(new char[]{'H','i'});
		String str4= String.valueOf(123);
		
		System.out.println("String Literal: "+str1);
		System.out.println("New String Object:"+str2);
		System.out.println("From Char Array:"+str3);
		System.out.println("From Interger:"+str4);
		
		System.out.println("\n------String Manipulation Functions------");
		
		System.out.println("String Length of str1: "+str1.length());
		System.out.println("String str2.toUpperCase(): "+str2.toUpperCase());
		System.out.println("String str2.toLowerCase(): "+str2.toLowerCase());
		System.out.println("str3.charAt(1): "+str3.charAt(1));
		System.out.println("str4 + 100: "+(str4 + 100));
		System.out.println("Checking if str1 contains 'World': "+str1.contains("World"));
		System.out.println("Checks if the str1 starts with'World'? "+str1.startsWith("Hello"));
		System.out.println("Checks if it ends with 'Hello'? "+str1.endsWith("Hello"));
		System.out.println("Index of o in str1: "+str1.indexOf("o"));
		System.out.println("Index of java in str1: "+str1.indexOf("java"));
	}

}
