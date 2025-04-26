// Syzu 4/26/25

// 🧠 Question 5: Scholarship Decision with Multiple Conditions

// Write a program that decides if a student qualifies for a scholarship, a partial scholarship, or no scholarship at all.
// Use both the && (AND) and || (OR) operators in your if conditions.

//Syzu 4/25/25

public class looptest {
  public static void main(String[] args) {

    int gpa = 89;
    boolean hasExtraCurriculars = true;

    if (gpa >= 90 && hasExtraCurriculars == true) {
      System.out.println("You get a full scholarship");
    } else if (gpa >= 85 || hasExtraCurriculars == true) {
      System.out.println("You get a partial scholarship");
    } else {
      System.out.println("No scholarship");
    }
  }
}
// My explanation
// First of all, so we will assign the variable int gpa with a value of 89 and also the boolean hasExtraCurriculars with a value of true, 
// then proceed to the if , the purpose of this if is to check if the gpa if its eligible for full scholarship, partial scholarship or otherwise no scholarship. So for the first condition, gpa is greater than or equal to 90 AND hasExtraCurriculars is equal to true,
// Since our gpa = 89, so gpa >= 90 which is false and the hasExtraCurriculars == true is True.
// But here's a catch because we've used AND operator because either one of the conditions turns out to be false then the whole condition is false so the first condition is false.
// But remember When using &&, both conditions must be true. If even one is false, the whole block is skipped
// So we will proceed to the next condition which is else if gpa is greater than 85 and we've used OR operator and hasExtracurriculars == true. So gpa >= 85 is true and also hasExtraCurriculars == true.
// Another important thing is even if only one condition inside || is true, the whole condition will still be treated as true. In your case both are true, but even if only one was true, it would still print.)
// So the 2 conditions is true so this conditions will be printed, But again fyi | |operator function is that either of the 2 conditions is true, 
// It will still be printed unlike the && operator that if either conditions turns to be false then it will not be printed.
// And if both the first and second conditions are false, only then the final else block would run
// Otherwise it will print else which has "No scholarship"
