// Syzu 4/29/25

// 1. Counting Divisible by 3, 5 and Both

// Instructions

// program counts how many numbers between 1 and 50 are divisible by 3, 5, or both.

// It starts with int i = 1 and int numberThree = 0, int numberFive = 0, int numberBoth = 0.

// The loop runs from 1 to 50, checking:

// If divisible by both 3 and 5, increment numberBoth.

// If divisible by only 3, increment numberThree.

// If divisible by only 5, increment numberFive.

// After the loop, the program prints the totals for each category: divisible by 3, 5, and both.


public class looptest {
  public static void main(String[] args) {
    
    int i = 1;
    int numberThree = 0;
    int numberFive = 0;
    int numberBoth = 0;

    while (i <= 50) {
      
      if ( i % 3 == 0 && i % 5 == 0) {
        numberBoth++;
      } else if (i % 3 == 0) {
        numberThree++;
      } else if (i % 5 == 0) {
        numberFive++;
      }
      i++;
    }
    System.out.println("The total numbers divisible by both 3 and 5 is : " + numberBoth);
    System.out.println("The total numbers divisible by 3 is : " + numberThree); 
    System.out.println("The total numbers divisible by 5 is : " + numberFive); 
  }
}
the output of this is
The total numbers divisible by both 3 and 5 is: 3
The total numbers divisible by 3 is: 13 
The total numbers divisible by 5 is: 7 

// My Explanation

// First, we assign int i = 1 and int numberThree = 0, numberFive = 0, numberBoth = 0. these counters start at 0 cuz we’ll use them to count how many numbers from 1 to 50 are divisible by 3, 5, or both.

// the while loop will run from i = 1 to 50 and check each number. First, we check if the number is divisible by both 3 and 5. if true, numberBoth will increment. example: 15, 30, 45.

// Next, we check if the number is divisible by 3 only. if true, numberThree will increment. example: 3, 6, 9, 12, 18...

// Then, we check if the number is divisible by 5 only. if true, numberFive will increment. example: 5, 10, 20, 25, 35...

// After the loop finishes, we print the total numbers divisible by both 3 and 5, by 3, and by 5.

