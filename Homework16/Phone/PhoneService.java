package Phone;

public class PhoneService {

    public boolean insertSimCard(Phone phone, SimCard[] simCard, int numberOfSIm){
        if(simCards[numberOfSim].getNumber() != 0){
            phone.setSimCard(simCards[numberOfSim]);
            return true;
        }else{
            return false;
        }

    }
    public SimCard removeSimCard(Phone phone){
        SimCard removedSimCard = phone.getSimCard();
        phone.setSimCard(null);
        return removedSimCard;
    }

    public SimCard changeSimCard(Phone phone, SimCard newSimCard){
        SimCard removedSimCard = phone.getSimCard();
        int oldnumber = removedSimCard.getNumber();
        newSimCard.setNumber(oldnumber);
        phone.setSimCard(newSimCard);
        removedSimCard.setNumber(0);
        return removedSimCard;

    }

    public boolean receivesSms(Phone phone,String message){
        String [] ourSmsMessages = phone.getSimCard().getSms();
        int emptyCell = firstEmptyCell(ourSmsMessages);
        if(emptyCell == -1){
            System.out.println("No memory for new SMS. Please delete old messages");
            return false;
        }else{
            ourSmsMessages[emptyCell] = message;
            return true;
        }
    }

    private int firstEmptyCell(String []messages){
        int cellNumber = -1;
        for (int i = 0; i < messages.length; i++){
            if(messages[i] == null){
                return i;
            }
        }return cellNumber;
    }

    public boolean deleteSmsMessage(Phone phone, int smsNumber) {
        if (smsNumber >= 0 && smsNumber < 10) {
            phone.getSimCard().getSms()[smsNumber] = null;
            return true;
        }else {
            System.out.println("There is no message with this number!");
            return false;
        }
    }

    public boolean deleteAllMessages(Phone phone){
        String [] newSmsMessages = new String[10];
        phone.getSimCard().setSms(newSmsMessages);
        return true;
    }

    public void adCover(Phone phone, Cover cover) {
        phone.getCover().setColor();
        phone.getCover().setMaterial();

    }


}
