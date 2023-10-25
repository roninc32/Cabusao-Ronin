import java.util.*;


public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Student person = new Student();
      
      System.out.print("Enter first name: ");
      String firstname = sc.nextLine();
      person.setFirstName(firstname);
      
      System.out.print("Enter middle name: ");
      String middlename = sc.nextLine();
      person.setMiddleName(middlename);
      
      System.out.print("Enter last name: ");
      String lastname = sc.nextLine();
      person.setLastName(lastname);
      
      System.out.print("Enter suffix: ");
      String suffix = sc.nextLine();
      person.setSuffix(suffix);
      
      person.getFullName();
      
      System.out.println(person.getFullName());
   }
}