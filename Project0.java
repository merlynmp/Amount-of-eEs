package project0package;

import javax.swing.JOptionPane;

// Merlyn Pothen

public class Project0 {
   public static void main(String[] args) {

      // This statement loops the program for the user to enter strings.
      // If the condition is false, then the loop ends
      while(true) {


         // s to store user input. lower to count number of e's in s. upper to count number of E's in s.
         String s;
         int lower = 0;
         int upper = 0;


         // allows user to enter string.
         s = JOptionPane.showInputDialog(null, "Please enter a sentence: ");


         // user can enter "stop" written in any way, which is why equalsIgnoreCase is used. 
         // If user enters stop, then the while loop condition would be false and the program would end.
         if(s.equalsIgnoreCase("Stop")) {
            System.exit(0);
         }


         // Using a for loop , we would go through every character in the string. 
         // Using charAt, we would look at the character at the index i in the string. 
         // Going through each character, if the character is e, then add 1 to lower. Else, if character is E, add 1 to upper.
         for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'e') {
               lower++;
            }
            else if(s.charAt(i) == 'E') {
               upper++;
            }
         }


         // shows message of results.
         JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lower + "\n" + "Number of upper case e's: " + upper);

      }

   }
}
