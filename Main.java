import java.util.Scanner;

/**
 * calculates letter grade
 * @author Rose
 */
public class Main {

  //calculates the letter grade of a percentage given
  public static void examGrade(double grade){
    
    //create an if statement to check the grade and print the letter grade accordingly
    if (grade >= 80){
      System.out.println("Your letter grade is A");
    }else if (grade >= 70 && grade <= 79){
      System.out.println("Your letter grade is B");
    }else if (grade >= 60 && grade <= 69){
      System.out.println("Your letter grade is C");
    }else if (grade >= 50 && grade <= 59){
      System.out.println("Your letter grade is D");
    }else{
      System.out.println("Your letter grade is F");
    }
    
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for their exam percentage
    System.out.println("What is your exam percentage?");
    double grade = input.nextDouble();

    
    examGrade(grade); 
    
  
  }
}
