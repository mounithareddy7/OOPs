package mypackage;

public class String_Immutability {

	public static void main(String[] args) {
		String str1="Hello";
		String str2=str1;
		String str3=" Hello World ";
		//Before change of 
		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
		//Modifying the string1
		str1= str1 + " World ";
		//After change 
		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
		//Str2 still points to the original string 
		System.out.println("After trim(): "+str3.trim());
		System.out.println("substring(0,8)"+str3.substring(0,8));
		System.out.println("concat(Welcome to JAVA)"+str1.concat("Welcome to JAVA"));
		//Replacing a with @
		System.out.println("Replace o with @: "+str1.replace("o", "@"));
		
	}

}
