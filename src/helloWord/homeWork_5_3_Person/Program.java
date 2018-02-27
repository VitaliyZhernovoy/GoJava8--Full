package helloWord.homeWork_5_3_Person;


public class Program extends MainPerson {
    public Program(String name, String surname,double selary) {
        super(name, surname,selary);
    }

    public static void main(String[] args) {
        Employee empl = new Employee("Tom", "Simpson",150.0, "Oracle");
        Employee2 emp2 = new Employee2("Karl", "Ohara",15000.0, "Googl+");

        Company comp = new Company();
        comp.addEmployee(empl);
        comp.addEmployee(emp2);
        comp.addEmployee( new Employee2("Karl232", "Ohara232323",15000.0, "Googl+232323"));

        SaveInfo  saveInfo = new SaveInfo();

        empl.paySelaryPerMons();
        empl.displayInfo();
        System.out.println();

        emp2.displayInfo();
        emp2.paySelaryPerMons();
        System.out.println();

        //comp.displayInfo();
        saveInfo.writeToFile("Files/KFC.txt", comp);


    }
}
