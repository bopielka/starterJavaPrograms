import java.util.Scanner;

public class ArrayParameters {
    Scanner sc = new Scanner(System.in);
    private int length;
    private int range;

    private int getInt(){
        return sc.nextInt();
    }

    public void closeInput(){
        sc.close();
    }

    public int getLength() {
        return length;
    }

    private void setLength() {
        System.out.println("How many numbers should I generate? ");
        int length = getInt();
        this.length = length;
    }

    public int getRange() {
        return range;
    }

    private void setRange() {
        System.out.println("I will generate numbers from 1 to __:");
        int range = getInt();
        this.range = range;
    }

    public void setParameters(){
        setLength();
        setRange();
    }
}
