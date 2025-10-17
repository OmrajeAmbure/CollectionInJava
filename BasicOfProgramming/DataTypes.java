package BasicOfProgramming;
/** 1. byte:-The byte data type is an 8-bit signed two's complement integer .
 *  it has a minimum value of -128 and a maximum value of 127 (inclusive)
 *  2. short: The short data type is a 16-bit signed two's complement integer.
 *  It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
 *  3. int: By default, the int data type is a 32-bit signed two's complement integer,
 *  which has a minimum value of -2^31 and a maximum value of 2^31-1
 *  4. long: The long data type is a 64-bit two's complement integer.
 *  The signed long has a minimum value of -2^63 and a maximum value of 2^63-1.
 *      Syntax - long l = 3454566675L;  ---> L is shoes the given value is long not integer
 *  5. float: The float data type is a single-precision 32-bit IEEE 754 floating point
 *  Note :- by default  it consider as double value so we used float because double is 64-bit .
 *       Syntax - float  f = 3.546f; ---> f  is shows the given value is float not double
 * 6.double: The double data type is a double-precision 64-bit IEEE 754 floating point
 * 7. boolean: The boolean data type has only two possible values: true and false.
 *  Use this data type for simple flags that track true/false conditions.
 *  This data type represents one bit of information, but its "size" isn't something that's precisely defined.
 * 8. char: The char data type is a single 16-bit Unicode character.
 *  It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
 *
 * Data Type --->Default Value (for fields)
 * byte	  --> 0
 * short ---> 0
 * int --->	0
 * long --->	0L
 * float ---> 0.0f
 * double	 ----> 0.0d
 * char	 ---> '\u0000'
 * String (or any object) --->	null
 * boolean ---> false
**/
public class DataTypes {
    public  static void main(String[] args) {
        // Primitive DataType :-
        byte b = 127;
        short s = 3346;
        int num1 = 32_95_48;
        long num2 = 23l;
        float f = 3.45f;
        double d = 4.5667;
        char c = 't';
        boolean value = true;

        // Non - Primitive DataType :-
        String str = "omraje";
        int arr[]  = {1,3,4,5,6,7};

    }
}
