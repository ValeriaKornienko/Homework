package Arrays;
 import java.util.Arrays;
public class backwardsArray {
    public int[] reverseArray(int[] workingArray){
        int[] reverseArray = new int[workingArray.length];
        for (int i = 0; i < reverseArray.length; i++) {
            int j = reverseArray.length - 1 - i;
            reverseArray[i] = workingArray[j];

        }
        return reverseArray;
    }
}
