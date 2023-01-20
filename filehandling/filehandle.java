
// Main Driver Method

import java.io.FileWriter;
import java.io.IOException;
// Import this class for handling errors


// Import the Scanner class to read content from text files

public class filehandle {
    public static void main(String[] args) 
        throws IOException
    {
        // initialize a string
        String str = "";
        try {
            // attach a file to FileWriter
            FileWriter fw= new FileWriter("file.txt");
            // read each character from string and write
            // into FileWriter
            for (int i = 0; i < str.length(); i++)
                fw.write(str.charAt(i));
            System.out.println("Successfully written");
            // close the file
            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
