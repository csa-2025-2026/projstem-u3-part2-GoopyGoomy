import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    // Problem 1
    System.out.println("Enter in a number");
    double target = 12.345;
    double user_input = scan.nextDouble();

    if (user_input == target)
    {
      System.out.println("YES!");
    }

    // Problem 2
    System.out.println("Enter in a number");
    double target2 = 46;
    double user_input2 = scan.nextDouble();

    if (user_input2 == target2)
    {
      System.out.println("YES!");
    }

    // Problem 3
    boolean bothEqual = user_input == user_input2;
    if (bothEqual)
    {
      System.out.println("YES!");
    }

    // Problem 4
    
    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
