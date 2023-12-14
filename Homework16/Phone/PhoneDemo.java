package Phone;

public class PhoneDemo {
    public static void main(String[] args) {
        SimCard sim1 = new SimCard(4333132);
        Cover cover1 = new Cover("black", "metal");
        Phone phone1 = new Phone(1234, "S22");
        PhoneService phoneService1 = new PhoneService();
        phoneService1.insertSimCard(phone1, sim1);
        phoneService1.adCover(phone1, cover1);

        SimCard sim2 = new SimCard (1236543);
        phoneService1.changeSimCard(phone1, sim2);
        phoneService1.receivesSms(phone1, "Hello World1!");
        phoneService1.receivesSms(phone1, "Hello World2!");
        phoneService1.receivesSms(phone1, "Hello World3!");
        phoneService1.receivesSms(phone1, "Hello World4!");
        phoneService1.receivesSms(phone1, "Hello World5!");
        phoneService1.receivesSms(phone1, "Hello World6!");
        phoneService1.receivesSms(phone1, "Hello World7!");
        phoneService1.receivesSms(phone1, "Hello World8!");
        phoneService1.receivesSms(phone1, "Hello World9!");
        phoneService1.receivesSms(phone1, "Hello World10!");


        System.out.println(phone1);

    }
}
