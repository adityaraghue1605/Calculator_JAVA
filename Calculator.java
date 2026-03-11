import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // Introduction to user 
        System.out.println("Namaste, Welcome to java calculator");
        System.out.println("I can perform ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION & AVG. OF TWO NUMBERS");
        // Menu 
        System.out.println("Please select one among the below operations.");

        System.out.println("Press - 1 For Addition");
        System.out.println("Press - 2 For Subtraction");
        System.out.println("Press - 3 For Multiplication");
        System.out.println("Press - 4 For Division");
        System.out.println("Press - 5 For Avg. Of Two Number");

        System.out.print("Operation : ");
        int Operation = sc.nextInt();

        System.out.print("Enter First Number for operation : ");
        int First = sc.nextInt();
        System.out.print("Enter Second Number for the peration : ");
        int Second = sc.nextInt();

        // Logic 
        if (Operation==1){
            int sum = First + Second;
            System.out.println("Addition of Two Numbers : " + sum);  
        } else if (Operation==2){
            int Diff = First - Second;
            System.out.println("Difference of Two Numbers : " + Diff);
        } else if (Operation==3){
            int Multiply = First * Second;
            System.out.println("Multiplication of Two Numbers : " + Multiply);
        } else if (Operation==4){
            int Division = First / Second;
            System.out.println("Division of Two Numbers : " + Division);
        } else if (Operation==5){
            int Avg = (First + Second)/2;
            System.out.println("Average of Two Numbers : "+ Avg);
        }
        
        // Signing Off 
        System.out.print("Thanks for using Java Calculator!");
    }
    
}
