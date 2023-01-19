package doms;

public class checkpal {
    static final int MAX_CHAR = 256;
    public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    
    static int isPalindrome(int n)
    {
          
        // Find reverse of n
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;
              
        // If n and rev are same, 
        // then n is palindrome
        return(n == rev) ? 1 : 0;
    }
      
    // prints palindrome between
    // min and max
    static void countPal(int min, int max)
    {
        for (int i = min; i <= max; i++)
            if (isPalindrome(i)==1)
                System.out.print(i + " ");
    }
    
 
    static void getOccurringChar(String str)
    {
         
        // Create an array of size 256
        // i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
 
        int len = str.length();
 
        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1)
                System.out.println(
                    "Number of Occurrence of "
                    + str.charAt(i)
                    + " is:" + count[str.charAt(i)]);
        }
    }
   
    public static void main(String[] args)
    {
        // Input string
        String str = "summus";
 
        // Convert the string to lowercase
        //problem 1
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
        //probelm 2nd
        countPal(100, 2000);

        // problem 3rd
        str = "Prince_is_intern_at_msbdocs";
        getOccurringChar(str);
    }
    
    
}
