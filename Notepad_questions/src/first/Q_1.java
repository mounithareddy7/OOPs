package first;
public class Q_1{

    public static void main(String[] args) {

        // Declare and initialize all primitive data types
        byte b = 100;
        short s = 10000;
        int i = 123456;
        long l = 123456789L;
        float f = 12.34f;
        double d = 123.456;
        char c = 'A';
        boolean bool = true;

        // Print variable values
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);

        System.out.println();

        // Print sizes using wrapper class constants
        System.out.println("Size of byte: " + Byte.SIZE + " bits");
        System.out.println("Size of short: " + Short.SIZE + " bits");
        System.out.println("Size of int: " + Integer.SIZE + " bits");
        System.out.println("Size of long: " + Long.SIZE + " bits");
        System.out.println("Size of float: " + Float.SIZE + " bits");
        System.out.println("Size of double: " + Double.SIZE + " bits");
        System.out.println("Size of char: " + Character.SIZE + " bits");
        System.out.println("Size of boolean: size not precisely defined"); // Java doesn't define fixed size
    }
}
