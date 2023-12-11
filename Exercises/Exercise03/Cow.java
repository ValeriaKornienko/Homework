package Exercise03;

public class Cow {

    public static String cowString(int numberOfCows){

        String fraze = "";

        if(numberOfCows == 1){
            fraze = "На лугу пасется " + numberOfCows + " корова";
        } else if(numberOfCows == 2 || numberOfCows == 3) {
            fraze = "На лугу пасется " + numberOfCows + " коровы";
        } else{fraze = "На лугу пасется " + numberOfCows + " коров";}


        return fraze;
    }
}
