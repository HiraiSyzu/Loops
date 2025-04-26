// Syzu 4/26/26

// Question 6: Scholarship + Club Leadership Eligibility

// Instruction:
// You need to assign: An int gpa value (example: 88)
  
// a boolean named hasExtracurriculars

// a boolean named isClubLeader

// Then create an if-else if-else chain that checks:

// If gpa is 90 or above AND hasExtracurriculars is true AND isClubLeader is true → Print: "You get a full scholarship with honors!"

// Else if gpa is 85 or above AND (hasExtracurriculars is true OR isClubLeader is true) →  Print: "You get a partial scholarship."

//Else → Print: "No scholarship awarded."
public class looptest {
  public static void main(String[] args) {

    int gpa = 89;
    boolean hasExtraCurricular = true;
    boolean isClubLeader = false;

    if (gpa >= 90 && hasExtraCurricular && isClubLeader) {
      System.out.println("You get a full scholarship with honors!");
    } else if (gpa >= 85 && hasExtraCurricular || isClubLeader) {
      System.out.println("You get a partial scholarship");
    } else {
      System.out.println("No scholarship awarded");
    }
  }
}
// First, we assign three variables: int gpa = 89, boolean hasExtraCurricular = true, and boolean isClubLeader = false.
// The purpose is to determine if the student qualifies for a full scholarship with honors, a partial scholarship, or no scholarship.

// In the first condition, gpa >= 90 && hasExtraCurricular && isClubLeader, gpa >= 90 is false because gpa is 89.
// Since we use the AND (&&) operator, even if hasExtraCurricular is true, the entire condition becomes false if any part is false.
// So we move to the next condition.

// The second condition, gpa >= 85 && hasExtraCurricular || isClubLeader, checks if the GPA is at least 85 and has extracurriculars, or if the student is a club leader.
// gpa >= 85 is true and hasExtraCurricular is true, so the first part (gpa >= 85 && hasExtraCurricular) is true.
// Since we are using the OR (||) operator, if the first part is already true, the condition is true even if isClubLeader is false.

// Therefore, it prints "You get a partial scholarship".
// If none of the conditions were true, it would print "No scholarship awarded".

