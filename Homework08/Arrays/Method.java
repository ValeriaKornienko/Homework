package Arrays;

public class Method {
    public boolean checkAllElementsUnique(int[] workingArray){
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = i + 1; j < workingArray.length; j++) {
                if (workingArray[i] == workingArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
