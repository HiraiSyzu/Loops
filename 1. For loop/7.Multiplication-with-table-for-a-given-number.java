//Syzu 4/25/25

// Question 7: "Multiplication Table for a Given Number"
// Instruction:
// Write a loop that generates the multiplication table for a given number (e.g., 7). The output should show the results of multiplying the number by 1 through 10.

public class LoopTest {

  public static void main(String[] args) {

    int num = 7;

    for (int i = 1; i <= 10; i++) {

      System.out.println(num + "x" + i + " = " + (num * i));
    }
  }
}
// My Explanation:
//We assign the variable int num with the value of 7. The loop starts with int i = 1, and the condition i <= 10 means the loop will run until i reaches 10. 
//For each i, we print the value of num, concatenate "x", the loop index i, and then the result of num * i. The output will display the multiplication table for the number 7, starting from 7x1 = 7 to 7x10 = 70.

