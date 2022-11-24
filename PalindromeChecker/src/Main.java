public class Main {
    public static void main(String[] args) {
        Actions action = new Actions();
        System.out.println("Write word or sentence to check if is palindrome: ");
        String wordGiven = action.readText();
        String word = action.editTextForChecking(wordGiven);
        action.printInfo(action.isWordPalindrome(word),wordGiven);

        System.out.println("Press ENTER to exit the program");
        action.readText();
        action.closeInput();
    }
    }