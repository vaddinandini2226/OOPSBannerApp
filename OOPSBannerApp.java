package oops;

/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 */

// Extend the user story 3 to further develop the OOPS Banner Application
// by using String arrays to hold banner lines and printing them in a loop.
// This use case improves upon UC3 by using a String array to store banner lines
// and iterating through them with a for-each loop, eliminating hardcoded print
// statements and improving modularity and reusability.

// Hint:
// 1. Define a String array with a size equal to the number of lines in the banner
// 2. Populate each index of the array with the corresponding banner line using String.join()
// 3. Use a for-each loop to iterate through the array and print each line
// 4. This approach eliminates repetitive print statements and improves maintainability



public class OOPSBannerApp {
    // Main method to run the banner display
    // Store each line of the OOPS banner in a String array.
    // Use a for-each loop to iterate through the array and print
    // each line sequentially to create the visual banner effect
    public static void main(String[] args){
        String[] lines=new String[7];
        lines[0] = String.join(" ", "   ***   ", "   ***   ", "*****    ", "   ***** ");
        lines[1] =  String.join(" ", " **   ** ", " **   ** ", "**  **   ", " ***     ");
        lines[2] =  String.join(" ", "**     **", "**     **", "**  **   ", " **      ");
        lines[3] = String.join(" ", "**     **", "**     **", "****     ", "  ****** ");
        lines[4] = String.join(" ", "**     **", "**     **", "**       ", "     *** ");
        lines[5] =  String.join(" ", "  **  ** ", "  **  ** ", "**       ", "   ***   ");
        lines[6] =  String.join(" ", "    ***  ", "   ***   ", "**       ", " ****    ");
        for(String line:lines){
            System.out.println(line);
        }
    }
}