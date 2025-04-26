//Syzu 4/25/25

// Question 5: "Printing All Characters of a String"
// Instruction:
// Create a for loop that iterates through each character of a given string and prints each character on a new line.

public class LoopTest {

  public static void main(String[] args) {
  
    String word = "Computer";

    for (int i = 0; i < word.length(); i++) {

      System.out.println(word.charAt(i));
    }
  }
}
// My Explanation:
// The loop runs from 0 to the length of the string (8 characters). The charAt(i) method is used to access each character by its index. The loop will print each character(Letter) of the string "Computer" on a new line.
