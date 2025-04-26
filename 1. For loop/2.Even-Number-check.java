//Syzu 4/25/25

//Question 2: "For Loop with Even Number Check"

//Instruction:
//Modify the previous loop to only print even numbers. Use an if condition inside the loop to check if a number is even using the modulo operator (%).

for (int i = 1; i <= 5; i++) {
  if (i % 2 == 0) {
    System.out.println(i);
  }
}

// My Explanation:
// This loop runs from 1 to 5. We will use the if statement to check if a number is even by using  i % 2 == 0. If the number is even, it is printed; if not, it is skipped. 
// The result will be the even numbers 2 and 4.
