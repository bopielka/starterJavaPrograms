import java.util.Scanner;

public class Actions {
    private Scanner input = new Scanner(System.in);

    public  String readText(){
        return input.nextLine();
    }

    public String editTextForChecking (String givenText){
        return givenText.trim().toLowerCase().replace(" ","");
    }

    public void closeInput(){
        input.close();
    }

    public boolean isWordPalindrome(String word){
        int wordLength = word.length();
        int lastChar = wordLength-1;
        int firstChar = 0;
        boolean temp;
        do{
            char first = word.charAt(firstChar);
            firstChar++;
            char last = word.charAt(lastChar);
            lastChar--;
            temp = first == last;
        }while (temp && firstChar<lastChar);
        return temp;
    }

    public void printInfo(Boolean isWordPalindrome, String wordGiven){
        if(isWordPalindrome)
            System.out.println("<" + wordGiven + "> is a palindrome.");
        else
            System.out.println("<" + wordGiven + "> is not a palindrome.");
    }
}
