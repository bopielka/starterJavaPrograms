public class GeneratorApp {
    public static void main(String[] args) {
        ArrayGenerator arrayGenerator = new ArrayGenerator();

        arrayGenerator.setParameters();
        arrayGenerator.counter(arrayGenerator.newArray(arrayGenerator.parameters.getLength()));
        System.out.println("Press ENTER to exit.");
        arrayGenerator.parameters.input.nextLine();
        arrayGenerator.parameters.input.nextLine();
        arrayGenerator.parameters.closeInput();
    }
}