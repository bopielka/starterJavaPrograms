public class Actions {

    public void smallestCommonMultiple(int firstNumber, int secoundNumber) {
        CheckNumbers check = new CheckNumbers();

        int smallestNumber = check.returnSmallerNumber(firstNumber, secoundNumber);
        int biggestNumber = check.returnBiggerNumber(firstNumber, secoundNumber);

        for (int i = biggestNumber; i > 0; i++) {
            if (i % smallestNumber == 0 && i % biggestNumber == 0) {
                System.out.println("Smallest common multiple for numbers: " + firstNumber + " and " + secoundNumber + " equals: " + i);
                break;
            }
        }
    }

    public void greatestCommonDivider(int firstNumber, int secoundNumber) {
        CheckNumbers check = new CheckNumbers();

        int smallestNumber = check.returnSmallerNumber(firstNumber, secoundNumber);

        for (int i = smallestNumber; i <= smallestNumber; i--) {
            if (i == 1) {
                System.out.println("There is no common divider.");
                break;
            } else if (firstNumber % i == 0 && secoundNumber % i == 0) {
                System.out.println("Greatest common divider for numbers " + firstNumber + " and " + secoundNumber + " equals: " + i);
                break;
            }
        }
    }

    public boolean isPrime(int number){
        int succesfullDividing=0;
        for(int i = number; i>=1; i--){
            if(number%i==0){
                succesfullDividing++;
            }
        }
        if(succesfullDividing == 2){
            return true;
        }else{
            return false;
        }
    }

    public int strong(int number){
        int strong=1;
        for(int i = 1; i<=number;i++){
            strong *= i;
        }
        return strong;
    }
}