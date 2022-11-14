import java.util.Random;

public class ArrayGenerator {
    Parameters parameters = new Parameters();
    Random rand = new Random();

    public void setParameters(){
        parameters.setParameters();
    }
    public int[] newArray(int length){
        int[] array1 = new int[length+1];
        for(int i = 0; i< parameters.getLength(); i++){
            array1[i] = rand.nextInt(parameters.getRange())+1;
        }
        return array1;
    }
    public void counter(int[] array){
        int counter = 0;
        for (int r = 1; r<=parameters.getRange();r++){
            for(int l = 0; l < parameters.getLength();){
                if (r==array[l]){
                    counter++;
                    l++;
                } else if(array[l]==0){
                 break;
                }else{l++;}
            }
            System.out.println("There are " + counter + " on numbers equal " + r);
            counter=0;
        }
    }
}
