//Syzu 4/26/25

//🧠 Question 1: Age Checker
// Instruction:
// Write a program that checks if a person is eligible to vote. Create a variable age, set it to any number you want. If the person is 18 or older, print:
// "You are eligible to vote!". Otherwise, print:"Sorry, you're not old enough to vote."

public class looptest {

  public static void main(String[] args) {

    int age = 17;

    if (age > 18) {
      System.out.println("You are eligible to vote!");
    } else {
      System.out.println("Sorry, you're not old enough to vote");
    }
  }
}
// First of all, we will assign a variable int age with a value of 17, Then we will proceed to the if statement so age > 18,
// if we will read the instruction clearly its stated that if the person is 18 or older, so i can either used > or  == operator but the instruction is clear that 18 or older not exactly 18 yrs old,
// and proceed since the value of age is less than 18. Then its false so the it will print else ."Sorry, you're not old enough to vote.

