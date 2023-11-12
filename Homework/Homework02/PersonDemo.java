package Homework02;


public class PersonDemo {
    public static void main (String [] args) {

        Person myPerson = new Person("Valeria", 29, "Fuerth");

        System.out.println("Меня зовут " + myPerson.name);
        System.out.println("Мне " + myPerson.age + " лет");
        System.out.println("Я из города " + myPerson.town);
    }
//"Меня зовут ..."
//"Мне ... лет"
//"Я из ..."
}
