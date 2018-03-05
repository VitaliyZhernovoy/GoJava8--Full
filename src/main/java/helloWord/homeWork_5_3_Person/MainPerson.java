package helloWord.homeWork_5_3_Person;

/**
 * Created by Оля on 08.10.2017.
 */
public abstract class MainPerson {

    private String name;
    private String surname;
    protected double selary;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public double getSelarye() {
        return  selary;
    }

    public double paySelaryPerMons(){
        selary = 20.8*8*150.0;

        return selary;
    }


    public MainPerson(String name, String surname,double selary){

        this.name = name;
        this.surname = surname;
        this.selary = selary ;
    }

    public  void displayInfo(){

        System.out.println("Имя: " + name + "\n" + "Фамилия: " + surname + "\n"+ "Зарплата в месяц: " + selary + " USD");
    }

}
