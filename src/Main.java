import com.engeto.evidenceZamestnancu.Person;
import com.engeto.evidenceZamestnancu.TimeClocksWorker;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Seznam zaměstnanců
        List<Person> persons = new ArrayList<>();

        //Přidání zaměstnanců do seznamu ručně
        persons.add(new Person(1, "Jan", "Novák", BigDecimal.valueOf(1000), true, 1));
        persons.add(new Person(2, "Petr", "Svoboda", BigDecimal.valueOf(2000), true, 2));
        persons.add(new Person(3, "Jana", "Králová", BigDecimal.valueOf(1500), true, 3));

        //Přidání osob do seznamu pomocí cyklu a výpis počtu zaměstnanců
        for (int i = 1; i <= 20; i++) {
            persons.add(new Person(i+3, ""+i, "Guest", BigDecimal.valueOf(300), false, 0));
        }

        System.out.println("Počet zaměstnanců: " + persons.size());

        // Výpis všech křestních jmen s označením host/zaměstnanec + ID

        System.out.println("Všechna křestní jména s označením host/zaměstnanec:");

        for (Person person : persons) {
            if (person.isEmployee()) {
                System.out.println(person.getID() + ") " + person.getName() + " - zaměstnanec");
            } else {
                System.out.println(person.getID() + ") " + person.getName() + " - host");
            }
        }

        TimeClocksWorker worker = new TimeClocksWorker();

        //Zařazení seznamu osob z ručně vytvořeného seznamu
        worker.addList(persons);

        //Výpis celkového počtu osob
        System.out.println("Počet osob v seznamu: " + worker.getNumberOfPersons());

    }
}