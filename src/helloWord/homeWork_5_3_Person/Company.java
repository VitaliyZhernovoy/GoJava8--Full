package helloWord.homeWork_5_3_Person;

import java.util.Arrays;

/**
 * Created by Оля on 08.10.2017.
 */
public class Company  extends MainPerson{

    private double selaryOllCompany;


    public Company(String name, String surname, double selary, double selaryOllCompany) {
        super(name, surname, selary);
        this.selaryOllCompany = selaryOllCompany;


    }
        @Override
        public void displayInfo(){

            String[] persons = {"Tom","Karl"};

            System.out.println("Зарплата всех сотрудников компании: " + selaryOllCompany);
            System.out.println("А именно : " + "\n" + persons[0] + " " + 24960.0  + " USD");
            System.out.println(persons[1] + " " +  15000.0  + " USD");




            }

}




