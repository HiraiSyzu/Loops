//Syzu 4/25/25

//Question 6: "Sum of Odd Numbers from 1 to 10 (with Sum Calculation)"
// Instruction:
// Use a for loop to add the odd numbers between 1 and 10. Instead of counting, you will calculate the sum of these odd numbers.

public class LoopTest {

  public static void main(String[] args) {
    int sum = 0;

    for(int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        sum += 1;
      }
    }
    System.out.println("The total sum of odd numbers is: " + sum);
  }
}
// Your Explanation:
// This is similar to the previous question, but instead of counting the odd numbers, we add them together. The loop will add the odd numbers (1, 3, 5, 7, 9) to the sum variable. The result will be 25.
