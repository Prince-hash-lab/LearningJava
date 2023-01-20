package Basics;

import java.io.*;

public class basic {
    public static void main(String[] args) {
        int i = 0;
        // while loop
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        // for loop

        for (i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        // do while loop

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        int day = 5;
        String dayString;
  
        // Switch statement with int data type
        switch (day) {
  
        // Case
        case 1:
            dayString = "Monday";
            break;
  
        // Case
        case 2:
            dayString = "Tuesday";
            break;
  
            // Case
        case 3:
            dayString = "Wednesday";
            break;
  
            // Case
        case 4:
            dayString = "Thursday";
            break;
  
        // Case
        case 5:
            dayString = "Friday";
            break;
  
            // Case
        case 6:
            dayString = "Saturday";
            break;
  
            // Case
        case 7:
            dayString = "Sunday";
            break;
  
        // Default case
        default:
            dayString = "Invalid day";
        }
        System.out.println(dayString);


        
    }
}
