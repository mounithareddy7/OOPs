package mypackage;

public class Type_conersion {

	public static void main(String[] args) {
		//implicite conversion
		int num = 10;
		double d= num;
		System.out.println("After Implicite Type conversion "+d);
		
		//explicite type conversion 
		double c = 10.9;
		int a = (int) c;
		System.out.println("After Emplicite Type conversion "+a);
	}

}
