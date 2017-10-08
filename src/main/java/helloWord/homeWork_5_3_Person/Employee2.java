package helloWord.homeWork_5_3_Person;

/**
 * Created by Оля on 08.10.2017.
 */
public class Employee2 extends MainPerson {

    private String company;

    public Employee2(String name, String surname,double selary,String company) {
        super(name, surname ,selary);
        this.company = company;
    }
    @Override
    public void displayInfo(){

        super.displayInfo();
        System.out.println("Компания: " + company);
    }

    @Override
    public double paySelaryPerMons(){

        return selary;
    }
}
