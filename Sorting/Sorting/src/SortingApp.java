public class SortingApp {
    public static void main(String[] args) {
        Array array = new Array();
        array.sortArray();
        System.out.println("Press ENTER to finish the program");
        array.parameters.sc.nextLine();
        array.parameters.sc.nextLine(); //those two are just to stop the program before closing to see the results
    }
}
