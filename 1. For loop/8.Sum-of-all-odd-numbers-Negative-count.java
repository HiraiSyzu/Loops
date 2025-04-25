//Syzu 4/25/25

// Question 8: "Sum of Odd Numbers (Negative Count)"
// Instruction:
// Create a loop that subtracts the odd numbers from 1 to 10 from a variable count (starting at 0). The count variable should be decremented by the odd numbers.

public class LoopTest {

  public static void main(String[] args) {

    int count = 0;

    for (int i = 1; i <= 10; i++) {

      if(i % 2 != 0) {
        count -= i;
      }
    }
    System.out.println("The total count of odd numbers is: " + count);
  }
}
// My Explanation:
// This loop will subtract each odd number between 1 and 10 from the count variable. Since count starts at 0, and we subtract each odd number, the result will be -25 (because we subtract 1, 3, 5, 7, and 9).
