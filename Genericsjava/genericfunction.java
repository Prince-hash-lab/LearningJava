package Genericsjava;

public class genericfunction {
    // A Generic method example
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName()+ " = " + element);
    }
    // Driver method
    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("Prince_is_Intern_at_MSBDOCS");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}
