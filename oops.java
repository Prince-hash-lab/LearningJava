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
	public static void main(String args[])
    {
        oops.set("Prince", 10000000.0f);
        oops.get();
		oops s = new oops();
		// System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
        
		// System.out.println(oops.sum(10, 20));
	}
}
