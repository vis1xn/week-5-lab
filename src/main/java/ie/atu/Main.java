package ie.atu;

public class Main {

    public static void main(String[] args)
    {
        Person Student1 = new Person("Tyrese", "Mumia", 19);
        System.out.println("Hello world!");
        System.out.println("Details are" + Student1.getFirstName());
        Student1.displayInfo();
    }

}