public class CheckNumbers {
    public int returnBiggerNumber(int firstNumber, int secoundNumber){
        if(firstNumber==secoundNumber){
            return firstNumber;
        } else if (firstNumber>secoundNumber) {
            return firstNumber;
        }else {
            return secoundNumber;
        }
    }
    public int returnSmallerNumber(int firstNumber, int secondNumber){
        if(firstNumber==secondNumber){
            return firstNumber;
        } else if (firstNumber<secondNumber) {
            return firstNumber;
        }else {
            return secondNumber;
        }
    }
}
