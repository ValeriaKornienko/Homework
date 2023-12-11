package Arrays;

public class Method {
    public int[] reverseArray(int[]workingArray){
        int[] reverseArray = new int [workingArray.length];
        for (int i = 0; i < workingArray.length; i++){
            reverseArray[i] = workingArray[reverseArray.length - 1 - i];
        } return reverseArray;
    }
}
