package Basics2;

// import java.io.*;
 
class prince {
    int num;
    String name;
 
    // this would be invoked while an object
    // of that class is created.
    prince() { System.out.println("Constructor called"); }
}
public class constructorsjava {
    public static void main(String[] args)
    {
        // this would invoke default constructor.
        prince prince1 = new prince();
 
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(prince1.name);
        System.out.println(prince1.num);
    }
}
