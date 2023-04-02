import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
        //creating object of Person class.
        Person person = new Person();
        person.setName("Rishika");
        person.setAge(21);
        System.out.println("Is "+ person.getName()+" adult ? " +person.isAdult(person.getAge()));
    }

}
