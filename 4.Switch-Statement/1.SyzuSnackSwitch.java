// Syzu 5/3/25

// 1.SyzuSnackSwitch.java

// Instruction:
// This Java program is a snack shop on your screen. We’re using the Scanner class to get input from the user basically,
// it’s like you asking someone what they want from the menu. Once we get their choice, we check it with a switch statement.
// Scanner Class:
// We’re using Scanner sc = new Scanner(System.in) to get what the user types in. Super simple, just like when you’re asking a friend, “Yo, what snack you want?” 🧐

// .toLowerCase():
//Now, we don’t care if they type in Candy, candy, or CANDY. We use .toLowerCase() to turn everything into lowercase. So, no matter how they type it, the program will still get it right! 🔥

// Switch Statement:
// After that, we throw it in a switch statement to check their snack choice. If they pick a valid snack (1-5), we give them the details (like price and description). If they type something weird, we just hit them with an “Invalid choice” message. Simple, right?

import java.util.Scanner; // Import Scanner Class
public class switchcase {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); // Creates Scanner object

    System.out.println("Good day... Welcome to the Syzu Junkfood Shop......"); 
    System.out.println();
    System.out.println("Our Menu for today is:");
    System.out.println();
    System.out.println("Chips");
    System.out.println("Cookie");
    System.out.println("Soda");
    System.out.println("Candy");
    System.out.println("Sandwich");
    System.out.println();
    System.out.println("Please Choose Any of it");

    String userChoice = sc.nextLine(); // Reads user input
    String snack = userChoice.toLowerCase();  // Here i've used .userChoice.toLowerCase(), so no matter what capitalization user input still the code recognized it
    System.out.println("You chose: " + userChoice); // Output user input

    switch (snack) { // Switch Statement
      case "chips": 
      System.out.println("25 pesos ... Crunchy and salty"); // If user chose "chips"
      break;
      case "cookie":
      System.out.println("30 pesos ... Sweet and chewy"); // If user chose "cookie"
      break;
      case "soda":
      System.out.println("30 pesos ... Fizzy and cold"); // if user chose "soda"
      break;
      case "candy":
      System.out.println("10 pesos... Sugar Overload"); // if user chose "candy"
      break;
      case "sandwich":
      System.out.println("50 pesos ... Heavy meal unlocked"); // if user chose "sandwich"
      break;
      default:
      System.out.println("Snack not Available"); // Otherwise if user choices isnt available
    } 
    sc.close(); // Close the scanner
  }
}
// My Explanation
// So first, we import the Scanner class and create the scanner object with Scanner sc = new Scanner(System.in) to read user input. 
// Then we print out the greeting and the menu choices. After that, we use String userChoice = sc.nextLine(); to grab the user's input, and we turn it into lowercase using String snack = userChoice.toLowerCase(); so no matter how they type it (like "Candy" or "CANDY"), it works the same.
// Next, we got the switch statement checking the value of snack. If the user picks "chips", for example, the first case will run and print the chips message. If the input doesn't match any case, the default block runs and says the snack isn't available.
// The break; is there to stop the switch from checking the other cases once a match is found. And finally, we close the scanner with sc.close(); to avoid any resource leaks.
