package helloWord.homeWork_5_3_Person;

import java.util.ArrayList;
import java.util.Arrays;


public class Company {

    public double getSelaryOllCompany(){
        double salary = 0;
        for (int i = 0; i < persons.length; i++) {
            salary = salary + persons[i].getSelarye();
        }
        //salary = persons[0].getSelarye() + persons[1].getSelarye();

        return salary;
    }

    MainPerson[] persons = null;

    private int size = 1;

    public void addEmployee(MainPerson person){
        if(persons == null) {
            persons = new MainPerson[size];
        } else {
            MainPerson[] copyPersons = new MainPerson[size];
            for (int i = 0; i < persons.length; i++) {
                copyPersons[i] = persons[i];
            }

            size++;
            persons = new MainPerson[size];
            for (int i = 0; i < copyPersons.length; i++) {
                persons[i] = copyPersons[i];
            }
        }
        persons[size-1] = person;
    }
}




