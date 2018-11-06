public class HelloWorld {
    //LearnJavaDEV276x [Module 1] C:\Users\micro\Documents\GitHub\LearnJavaDEV276x on Surface
    //LearnJavaDEV276x [Module 1] ~/Documents/GitHub/LearnJavaDEV276x on Mac
    //class variables can be used in all methods, but they must be started using "public static final"
    public static final double PI = 3.14;
    public static final int DAYS_IN_A_WEEK = 7;
    public static final String myName = "Michael Lin";

    //main method, this is the method that the computer executes in the console
    public static void main(String[] args){
        printEscapeSequences();
        printControlFlow();
        showJavaDataTypes();
        usingVariables();
        usingMathOperations();
        System.out.println(12 / 7 * 4.4 * 2 / 4);
    }

    //MODULE 1 | BASIC JAVA COMMANDS
    public static void printEscapeSequences(){
        System.out.println("This escape sequence \nmakes a new line");
        System.out.println("This escape sequence \\ turns into a single slash");
        System.out.println("This escape sequence \"creates quotes\"");
        System.out.println("This escape sequence \tmakes a tab indent");
    }
    public static void printControlFlow() {
        System.out.println("Calling on a method.");
    }

    //MODULE 1 | DATA TYPES AND VARIABLES
    public static void showJavaDataTypes(){
        System.out.println("The Java data types are \nint(integers):213,3,-51,etc. \ndouble(real numbers):23.1,0.5,-1.4, etc.");
        System.out.println("char(one character):'A', '1', 'z', '%' \nboolean(true or false):true, false");
    }
    public static void usingVariables(){
        System.out.println("My name is " + myName);
        int Computers = 2;
        System.out.println("I have " + Computers + " computers");
    }
    public static void usingMathOperations(){
        //PEMDAS applies
        //treat modulus % as multiplication and division
        //<!>if int/int=double value, take the number before decimal without rounding, e.g. 15/4=3.75 =3, not 4
        //int with double value = double value
        int x = 11;
        int y = 5;
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + (x/y));
        System.out.println("x % y = " + (x%y)); //divides x by y, and gives the remainder
        x++; //x = x+1 (using x-- works too to subtract 1)
        y *= 10; //y = y*10(using += -= /= %= works too), "10" can be an "integer" e.g. y+=x is y=y+x
        System.out.println("x add one = " + x);
        System.out.println("y multiplied by 10 = " + y);
    }


}