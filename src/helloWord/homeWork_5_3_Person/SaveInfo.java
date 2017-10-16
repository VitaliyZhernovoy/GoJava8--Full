package helloWord.homeWork_5_3_Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class SaveInfo {

   public static void writeToFile(String fileName, Company company) {

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Зарплата всей компании : " + company.getSelaryOllCompany());
//
//           writer.write( company.getName() + company.getSurname() + company.getSelarye());
//            writer.write("Зарплата всех сотрудников компании: " + company.getSelarye());
//            writer.write("А именно : " + "\n" + persons[0] + " " + 24960.0  + " USD");
//            writer.write(persons[1] + " " +  15000.0  + " USD");
////            writer.write("Инфа о Компании\n" );
////            writer.write("Инфа о Компании\n" );
////            writer.write("Инфа о Компании\n" );

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


