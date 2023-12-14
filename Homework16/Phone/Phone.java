package Phone;

public class Phone {

    private SimCard[] simCard;
    private int imei;
    private String model;
    private Cover cover;
    public Phone(int imei, String model){
        this.imei = imei;
        this. model = model;


    }
    public int getImei() {
        return imei;
    }

    public SimCard getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public String getModel() {
        return model;
    }

    public Cover getCover(){return cover;}

    public void setCover(Cover cover){this.cover = cover;}


    @Override
    public String toString() {
        return "Phone{" +
                "imei=" + imei +
                ", simCard=" + simCard +
                ", model='" + model +
                ", Cover=" + cover + '\'' +
                '}';
    }






}
