package helloWord.homeWork_5_3_Person;

/**
 * Created by Оля on 08.10.2017.
 */
public class Employee extends MainPerson {

    private String company;
    
    public Employee(String name, String surname,double selary,String company) {
        super(name, surname, selary);
        this.company=company;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Компания: " + company);
    }
    @Override
    public double paySelaryPerMons(){
        selary = 20.8*8*150.0;
        return selary;
    }
}
