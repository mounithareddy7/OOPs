package mypackage;

public class String_Comparison {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");
		String str4="hello";
		
		System.out.println("Reference comparison (==)");
		System.out.println("str1==str2"+str1==str2);
		System.out.println("str2=-str3"+str2==str3);
		
		System.out.println("Content comparison (.equals())");
		System.out.println("str1.equals(str2)"+str1.equals(str2));
		System.out.println("str2.equals(str3)"+str2.equals(str3));
		System.out.println("str1.equals(str4)"+str1.equals(str4));
		
		
		
	}

}
