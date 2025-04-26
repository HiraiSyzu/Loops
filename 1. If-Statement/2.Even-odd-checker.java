// Syzu 4/26/25

//🧠 Question 2: Age Checker
// Instruction:
// Write a program that checks if a person is eligible to vote.
// Create a variable age, set it to any number you want.

public class looptest {

  public static void main(String[] args) {

// If Even
    int num = 10;

    if (num % 2 == 0) {

      System.out.println("The number is even");
    } else {
      System.out.println("Then number is odd");
    }
  }
}
// If Odd
    int num = 9;

    if (num % 2 != 0) {

      System.out.println("The number is even");
    } else {
      System.out.println("Then number is odd");
    }
  }
}
// My Explanation:
// First of all, we will assign a variable int num with a value of 9.Then proceed to if statement, this part we will check if our int num value is either odd or even. 
// To determine that we will use if statement to know if its odd or even so here num % 2 == 0, Since our num value is 9 % 2 since that is modulo operator. it will only takes the remainder value, 
// So 9 / 2 is 4.5 so the remainder is 1 and 1 == 0 is obviously false because they're not equal so the else will be printed the output is "The number is odd". 
