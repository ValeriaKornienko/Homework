package Tasks;

public class Task3 {
    public static String cowPhrase(int n){

        String cowWordForm;
        if(n == 1){
            cowWordForm = "корова";
        }else if( n == 2 || n == 3){
            cowWordForm = "коровы";
        }else{
            cowWordForm = "коров";
        }
        return "На лугу пасется " + n + " " + cowWordForm;
    }

}
