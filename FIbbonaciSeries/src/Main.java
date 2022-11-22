import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double> fibonacciNumbers = new ArrayList<>();

        fibonacciNumbers.add(1.0);
        fibonacciNumbers.add(1.0); //first two numbers
        System.out.println("How many numbers from Fibbonacci series would You like to see?");
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt()-2; //-2 because first two numbers are added by hand
        int numberInOrder = 0;
        do {
           fibonacciNumbers.add(fibonacciNumbers.get(numberInOrder)+fibonacciNumbers.get(numberInOrder+1) );
           numberInOrder++;
        } while (numberInOrder!=arrayLength);

        for (double i: fibonacciNumbers) {
            System.out.println(i);
        }
        System.out.println("Press ENTER to exit the app.");
        input.nextLine();
        input.nextLine();
        input.close();
    }
}
