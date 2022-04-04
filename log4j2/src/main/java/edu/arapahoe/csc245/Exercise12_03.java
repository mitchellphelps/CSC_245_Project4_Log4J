// Author: Mitchell Phelps
// Date Last Ran: April 3, 2022
// Class: CSC 245
// Summary:
//          Makes an array of 100 random ints, and lets the user chose to display and integer
//          in the array.

package edu.arapahoe.csc245;

// Imports
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Class declaration.
public class Exercise12_03 {

    // Instantiate a logger to use.
    private static final Logger logger = LogManager.getLogger(Exercise12_03.class);

    // Main function.
    public static void main(String[] args) {
        // Initialize a new array with 100 elements.
        int[] data = new int[100];

        // Initialize array
        for (int i = 0; i < 100; i++)
            data[i] = (int)(Math.random() * 10000);

        // Make a new scanner object.
        Scanner input = new Scanner(System.in);

        // Receive user input.
        System.out.print("Enter an index: ");
        int index = input.nextInt();

        // Start the debug process.
        logger.debug("Trying to find user's element.");
        String message;
        // Try to print user element.
        try {
            if (logger.isDebugEnabled()) {
                message = "The element is: " + data[index];
                logger.debug(message);
            }
        }
        catch (Exception ex) {
            message = "Index invalid";
            logger.error(message, ex);
        }
    }
}
