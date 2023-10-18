import java.util.*;

public class Calculator {

   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      
      int x;
      int y;
      int z;
      
      System.out.println("Enter your first number: ");
      x = sc.nextInt();
      
      System.out.println("Enter your second number: ");
      y = sc.nextInt();
      
      z = x + y;
      System.out.println("The addition of two numbers is: " +z);
      
      z = x * y;
      System.out.println("The multiplication of two numbers is: " +z);
      
      z = x / y;
      System.out.println("The division of two numbers is: " +z);
   
   }

}