// Syzu 4/26/25

// Question 7: Even,Odd,and a Little Special
// Instruction:
You have two integers and one boolean:

// int a = 12;  int b = 8; boolean isSpecial = true;
// Write an if-else statement that:
// Prints "Sum is even AND special!" if the sum of a and b is even and isSpecial is true.
// Prints "Sum is even but NOT special." if the sum is even but isSpecial is false.
// Prints "Sum is odd!" if the sum is odd (no need to check isSpecial if odd).

public class looptest {
  public static void main(String[] args) {

    int a = 18;
    int b = 4;
    boolean isSpecial =  true;

    // Sum of a and b
    int sum = a + b;
    
    // If Statement
    if (sum % 2 == 0 && isSpecial) {
      System.out.println("Sum is even AND special");
    } else if (sum % 2 == 0 && !isSpecial) {
      System.out.println("Sum is even but NOT special");
    } else if (sum % 2 != 0) {
      System.out.println("Sum is Odd");
    } else {
      System.out.println("No Sum");
    }
  }
}
// My Explanation
// First, we assign 3 variables: int a = 18, int b = 4, and boolean isSpecial = true. Then we get the sum of a and b: int sum = a + b; (so, sum = 22).
// Next we proceed to the if statement. We check if the sum is even (sum % 2 == 0) and if isSpecial is true. Since both are true, it prints: "Sum is even AND special".
// after that we check if the sum is even and isSpecial is false (!isSpecial). Since isSpecial is true, this condition is false, so nothing is printed here.
// Next, we check if the sum is odd (sum % 2 != 0). Since the sum is even, this condition is false as well.
// lastly, since the first condition was true, the else block is skipped, and "No Sum" is not printed.
