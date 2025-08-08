package mypackage;

public class String_Builder_Buffer {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Hello");
		System.out.println("String Builder");

		sb.append(" World");
		System.out.println(sb);
		
		sb.insert(5, "JAVA");
		System.out.println(sb);
		
		sb.replace(4, 6, "@");
		System.out.println(sb);
		
		sb.delete(8, 14);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.toString();
		System.out.println(sb);
		System.out.println("String Buffer");
		
		
		StringBuffer sbf=new StringBuffer("Hi");
		sbf.append(" Mounitha");
		System.out.println(sbf);
		
		sbf.insert(11, " Reddy");
		System.out.println(sbf);
		
		sbf.replace(3, 11, "Ayaan");
		System.out.println(sbf);
		
		sbf.delete(9, 15);
		System.out.println(sbf);
		
		sbf.reverse();
		System.out.println(sbf);
		
		sbf.toString();
		System.out.println(sbf);
	}

}
