import java.util.Scanner;

public class Parameters {
    public Scanner input = new Scanner(System.in);
    private int length;
    private int range;

    private int getInt(){
        return input.nextInt();
    }

    public void closeInput(){
        input.close();
    }

    public int getLength() {
        return length;
    }

    public void setLength() {
        System.out.println("How may numbers should I generate: ");
        this.length = getInt();
    }

    public int getRange() {
        return range;
    }

    public void setRange() {
        System.out.println("I will generate numbers from 1 to: ");
        this.range = getInt();
    }
    public void setParameters(){
        setLength();
        setRange();
    }
}
