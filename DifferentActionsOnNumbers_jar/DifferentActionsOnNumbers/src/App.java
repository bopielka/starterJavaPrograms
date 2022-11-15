public class App {
    public static void main(String[] args) {
        ReadNumbers read = new ReadNumbers();
        Menu menu = new Menu();

        int firstNumber, secoundNumber;

        for (int i = 1; i > 0;) {
            System.out.println("Give us two numbers please!");
            firstNumber = read.getNumber();
            secoundNumber = read.getNumber();

            menu.showMenu();
            menu.showNumbers(firstNumber,secoundNumber);
            menu.choice(read.getNumber(), firstNumber, secoundNumber);
            i = menu.askToContinue();
        }
    }
}