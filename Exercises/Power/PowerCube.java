package Power;

public class PowerCube {
    public int pow(int number){
        int pow = 3;
        int result = 1;
        for (int i = 0; i < pow; i++){
            result = result * number;
        }
        return result;
    }


}
