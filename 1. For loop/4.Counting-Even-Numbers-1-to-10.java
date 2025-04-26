//Syzu 4/25/25

//Question 4: "Counting Even Numbers from 1 to 10"
//Instruction:
//Write a loop that counts how many even numbers are between 1 and 10 (inclusive). Use an if condition to check if the number is even.

public class LoopTest {

  public static void main(String[] args) {
  
    int sum = 0;
    
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        sum++;
      }
    }
    System.out.println("The total sum of even numbers is: " + sum);
  }
}
// My Explanation:
// In this case, we will count how many are  the even numbers between 1 and 10 by checking if each number is divisible by 2 (i % 2 == 0). The loop increments (i++) the sum each time it finds an even number. 
// The final count will be 5 (the even numbers are 2, 4, 6, 8, and 10).

