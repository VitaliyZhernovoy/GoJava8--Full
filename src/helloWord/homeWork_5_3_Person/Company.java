package helloWord.homeWork_5_3_Person;

/**
 * Created by Оля on 08.10.2017.
 */
public class Company  extends MainPerson{

    private double selaryOllCompany;

    public Company(String name, String surname, double selary,double selaryOllCompany) {
        super(name, surname, selary);
        this.selaryOllCompany = selaryOllCompany;
    }

}

