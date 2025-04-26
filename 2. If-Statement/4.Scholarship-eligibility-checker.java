// Syzu 4/26/25

//🧠 Question 4: Scholarship Eligibility Checker
// Instruction:
// Write a program that determines if a student is eligible for a scholarship based on their GPA and extracurricular involvement.

// Create an int gpa variable (out of 100).

// Create a boolean hasExtracurriculars variable (true or false).

// A student is eligible for a scholarship if their GPA is 85 or above and they participate in extracurricular activities.

// If their GPA is above 90 but they don’t have extracurriculars, they get a partial scholarship.

// All others are not eligible.

public class looptest {
  public static void main(String[] args) {

    int gpa = 90;

    boolean hasExtraCurriculars = true;

    if (gpa >= 85 && hasExtraCurriculars) {
      System.out.println("You are eligible for a scholarship");
    } else if (gpa > 90) {
      System.out.println("You are eligible for a partial scholarship");
    } else {
      System.out.println("Sorry, you're not eligible for a scholarship");
    }
  }
}
// First of all, we will assign a variable int gpa with a value of 90, and also we will assign boolean hasExtracurriculars which is true. 
// So proceed to first if condition which is gpa is greater than or equal to 85 AND operator hasExtraCurriculars, so gpa is 90 >= 85 which is true because our gpa is greater than or equal to 85 AND hasExtracurriculars which is the first if condition is true.
// But here's a catch if either of gpa or hasExtracurriculars become or even we set it to  false then the first if condition will be false because thats the purpose of AND (&&) operator, 
// either one of the condition is false then automatically the whole condition is false. And we will proceed now to else if (gpa > is greater 90). So gpa > 90 which is false because its 90 > 90 which is false, then otherwise it print ("Sorry, you're not eligible for a scholarship".
