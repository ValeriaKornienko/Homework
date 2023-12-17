package Arrays;

public class Task3 {
    public int countRepeat(int[] workingArray, int findNumber){
        int counter = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] == findNumber) {
                counter++;
            }
        }
        return counter;}
}
