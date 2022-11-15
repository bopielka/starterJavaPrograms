import java.util.Scanner;

public class ReadNumbers {
    private Scanner input = new Scanner(System.in);

    public int getNumber(){
        System.out.println("Enter number and press ENTER.");
       return input.nextInt();
    }

    public void closeInput(){
        input.close();
    }
}
