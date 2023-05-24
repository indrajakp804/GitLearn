class Helper {
 
    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {
 
        // Returns product of integer numbers
        return a * b;
    }
 
    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
 
        // Returns product of double numbers
        return a * b;
    }
}
 
// Class 2
// Main class
class MUL {
 
    // Main driver method
    public static void main(String[] args)
    {
 	Helper helper=new Helper();
        // Calling method by passing
        // input as in arguments
        System.out.println(helper.Multiply(2, 4));
        System.out.println(helper.Multiply(5.5, 6.3));
    }
}

