import java.util.Random;

public class Array {
    ArrayParameters parameters = new ArrayParameters();
    Random rand = new Random();

    private int[] newArray(){
        parameters.setParameters();
        int[] array = new int[parameters.getLength()];
        for(int i = 0; i< parameters.getLength();i++){
            array[i] = rand.nextInt(parameters.getRange())+1;
        }
        return array;
    }

    public void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    int[] sortArray(){
        int[] array = newArray();
        System.out.println("Before sorting: ");
        printArray(array);
        int temp = 0;
        int actions=0;
        int totalActions = 0;
        do{
            int i = 0;
            actions=0;
        for (i = 0; i<array.length-1;i++){

            if(array[i]>array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                actions++;
                totalActions++;
            }
        }}
        while (actions!=0);
        System.out.println("");
        System.out.println("After sorting: ");
        printArray(array);
        System.out.println("");
        System.out.println("Operations count: " + totalActions);
        return array;
    }
}
