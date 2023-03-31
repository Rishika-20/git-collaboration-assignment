import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of person:");
        String name = scan.nextLine();
        System.out.println("Enter the age of the person to check whether he/she is adult or not? ");
        Integer age = scan.nextInt();
        //creating object of person class.
        Person person = new Person(name,age);
        System.out.println("Is the person adult ? " +person.isAdult(age));
    }
}