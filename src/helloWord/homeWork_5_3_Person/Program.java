package helloWord.homeWork_5_3_Person;

/**
 * Created by Оля on 08.10.2017.
 */
public class Program extends MainPerson {
    public Program(String name, String surname,double selary) {
        super(name, surname,selary);
    }

    public static void main(String[] args) {
        Employee empl = new Employee("Tom", "Simpson",150.0, "Oracle");
        Employee2 emp2 = new Employee2("Karl", "Ohara",15000.0, "Googl+");

        empl.paySelaryPerMons();
        empl.displayInfo();
        System.out.println();

        emp2.displayInfo();
        emp2.paySelaryPerMons();
        System.out.println();

//        System.out.println(firstName);
    }
}
