//Syzu 4/25/25

// Question 3: "Sum of Odd Numbers from 1 to 10"
// Instruction:
// Write a for loop that adds up the odd numbers from 1 to 10. Use an if condition to check if the number is odd and then add it to a sum variable.

public class LoopTest {

  public static void main(String[] args) {
    
    int count = 0;
    
    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0) {
        count += i;
      }
    }
    System.out.println("The total count of odd number is: " + count);
  }
}

// My Explanation:
// The loop runs from 1 to 10, checking each number to see if it is odd (using i % 2 != 0). If the number is odd, it is added to the count variable.
// The final sum will be 25 because the odd numbers between 1 and 10 are 1, 3, 5, 7, and 9.
