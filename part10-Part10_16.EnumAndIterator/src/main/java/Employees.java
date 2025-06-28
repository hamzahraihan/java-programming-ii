/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
import java.util.*;

public class Employees {

    private List<Person> person;

    public Employees() {
        this.person = new ArrayList<Person>();
    }

    public void add(Person personToAdd) {
        this.person.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> personIterate = peopleToAdd.iterator();
        while (personIterate.hasNext()) {
            this.person.add(personIterate.next());
        }
    }

    public void print() {
        Iterator<Person> people = this.person.iterator();
        while (people.hasNext()) {
            System.out.println(people.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> people = this.person.iterator();
        while (people.hasNext()) {
            Person p = people.next();
            if (p.getEducation() == education) {
                System.out.println(p);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> people = this.person.iterator();
        while (people.hasNext()) {
            if (people.next().getEducation() == education) {
                people.remove();
            }
        }
    }
}
