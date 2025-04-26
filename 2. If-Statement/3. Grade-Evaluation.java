// Syzu 4/26/26

// 🧠 Question 3: Grade Evaluator

// Instruction:
// Write a program that checks the grade of a student based on their score.
// Create a variable called score and assign it any number between 0 to 100.
// Then use an if-else if-else statement to print the following:

//If the score is 90 or above: "Excellent"

//If the score is 75 to 89: "Good Job"

// If the score is 60 to 74: "You Passed"

// Below 60: "Better luck next time"

public class looptest {
  public static void main(String[] args) {

    int score = 93;

    if (score > 90) {
      System.out.println("Excellent");
    } else if (score < 90) {
      System.out.println("Good Job");
    } else if (score < 75) {
      System.out.println("You Passed");
    } else {
      System.out.println("Better luck next time");
    }
    }
  }
// My Explanation:
// We assign a variable int score with a value of 93. Then we proceed to the if statement: the first condition checks if score > 90.
// Since the score is 93, this condition is true, and the program executes this block. The other conditions (score < 90 and score < 75) are skipped because they aren't needed once the first block is true. 
// Therefore, the final output is "Excellent".
