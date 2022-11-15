import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    Actions actions = new Actions();

    public void showMenu(){
        System.out.println("What would You like to do with those two numbers?");
        System.out.println("Press 1 to compute the smallest common multiple.");
        System.out.println("Press 2 to compute greatest common divisor.");
        System.out.println("Press 3 to check if numbers are prime.");
        System.out.println("Press 4 to compute n! of both numbers.");
    }
    public int askToContinue(){
        System.out.println("Press 1 to try with different numbers.");
        System.out.println("Press 0 to exit.");
        int choice = input.nextInt();
        switch (choice){
            case 1: return 1;
            case 0: return 0;
            default:
                System.out.println("There is no such option.");
                return 1;
        }
    }

    public void showNumbers(int firstNumber, int secoundNumber){
        System.out.println("------------------");
        System.out.println("FIRST NUMBER = "+ firstNumber);
        System.out.println("SECOUND NUMBER = "+secoundNumber);
    }
    public void choice(int choice, int firstNumber, int secoundNumber){
        switch (choice){
            case 1: actions.smallestCommonMultiple(firstNumber,secoundNumber);
            break;

            case 2: actions.greatestCommonDivider(firstNumber,secoundNumber);
            break;

            case 3:
                System.out.println("First number (" + firstNumber+") is prime: " +actions.isPrime(firstNumber));
                System.out.println("Secound number (" + secoundNumber+") is prime: "+actions.isPrime(secoundNumber));
            break;
            case 4:
                System.out.println(""+firstNumber+"! = "+actions.strong(firstNumber));
                System.out.println(""+secoundNumber+"! = "+actions.strong(secoundNumber));
            default:
                System.out.println("There is no such choice.");
        }
    }
}

