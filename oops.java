public class oops {

    static String Employee_name;
    static float Employee_salary;
 
    static void set(String n, float p) {
        Employee_name  = n;
        Employee_salary  = p;
    }
 
    static void get() {
        System.out.println("Employee name is: " +Employee_name );
        System.out.println("Employee CTC is: " + Employee_salary);
    }



	// Overloaded sum().
	// This sum takes two int parameters
	public int sum(int x, int y)
	{
		return (x + y);
	}

	// Overloaded sum().
	// This sum takes three int parameters
	public int sum(int x, int y, int z)
	{
		return (x + y + z);
	}

	// Overloaded sum().
	// This sum takes two double parameters
	public double sum(double x, double y)
	{
		return (x + y);
	}

	// Driver code
	public static void main(String... args) {    
		// The comment below is no typo.     
		// \u000d  System.out.println("This Comment Executed!");  
	} 
}
