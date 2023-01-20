package ExceptionalHandling;

import java.io.*;

class SuperClass {
 
    // SuperClass declares an exception
    void method() throws RuntimeException
    {
        System.out.println("SuperClass");
    }
}
public class exceptionalhandlingwithpolymorphism extends SuperClass {
 
        // SubClass declaring a child exception
        // of RuntimeException
        void method() throws ArithmeticException
        {
     
            // ArithmeticException is a child exception
            // of the RuntimeException
            // So the compiler won't give an error
            System.out.println("SubClass");
        }
     
        // Driver code
        public static void main(String args[])
        {
            SuperClass s = new exceptionalhandlingwithpolymorphism();
            s.method();
        }
    
}
