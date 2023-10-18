import java.util.*;

public class Main {

   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      Cat cat = new Cat();
      Dog dog = new Dog();
      Frog frog = new Frog();
      Fox fox = new Fox();
      
      System.out.print("Enter number from 1-4: ");
      int userChoice = sc.nextInt();
      
      switch (userChoice) {
      
         case 1:
            System.out.println("The animal is Cat");
            cat.animalSound();
            break;
         
         case 2:
            System.out.println("The animal is Dog");
            dog.animalSound();   
            break;
                     
         case 3:
            System.out.println("The animal is Frog");
            frog.animalSound();
            break;
            
         case 4:
            System.out.println("The animal is Fox");
            fox.animalSound();
            break;
            
         default:
            System.out.println("Must enter a number only between 1 - 4");
      
      }
   
   }

}