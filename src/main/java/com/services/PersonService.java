/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;
import com.models.Person;
import java.util.ArrayList;
/**
 *
 * @author jsme4
 */
public class PersonService {
    private String[][] arrayPersons = {
        {"1", "adad", "fasf@gsdgs"},
        {"3", "momo", "assad"},
        {"5", "mui", "ssss"},
        {"2", "mama", "aaaaaa"}};
    
    private static ArrayList<Person> persons = new ArrayList<Person>();
    
    public PersonService(){
        for (int i = 0; i < arrayPersons.length; i++) {
            Person person = new Person();
            person.setId(Integer.parseInt(arrayPersons[i][0]));
            person.setName(arrayPersons[i][1]);
            person.setEmail(arrayPersons[i][2]);
            persons.add(person);
        }
    }
    
    public ArrayList<Person> getAll(){
        /*
        ArrayList <Person> persons = new ArrayList<>();
        for(String[] arrayPerson : arrayPersons){
            Person person = new Person();
            person.setId(Integer.parseInt(arrayPerson[0]));
            person.setName(arrayPerson[1]);
            person.setEmail(arrayPerson[2]);
            persons.add(person);
        }
        */
        return persons;
    }
    
    public Person get(int id) {
        Person person = null;
        /*
        for (String[] arrayPerson : arrayPersons) {
            if(id == Integer.parseInt(arrayPerson[0])) {
                person = new Person();
                person.setId(Integer.parseInt(arrayPerson[0]));
                person.setName(arrayPerson[1]);
                person.setEmail(arrayPerson[2]);
                break;
            }
        }
        */
        for (Person p : persons) {
            if(id == p.getId()) {
                person = p;
                break;
            }
        }
        return person;
    }
    /*
    public Person getEmail(String email) {
        Person person = null;
        for (String[] arrayPerson : arrayPersons) {
            if(id == Integer.parseInt(arrayPerson[0])) {
                person = new Person();
                person.setId(Integer.parseInt(arrayPerson[0]));
                person.setName(arrayPerson[1]);
                person.setEmail(arrayPerson[2]);
                break;
            }
        }
        return person;
    }
    */
    public Person getByEmail(String email) {
        Person person = null;
        /*
        for (String[] arrayPerson : arrayPersons) {
            if(email.equals(arrayPerson[2])) {
                person = new Person();
                person.setId(Integer.parseInt(arrayPerson[0]));
                person.setName(arrayPerson[1]);
                person.setEmail(arrayPerson[2]);
                break;
            }
        }
        */
        for (Person p : persons) {
            if(email.equals(p.getEmail())) {
                person = p;
                break;
            }
        }
        return person;
    }
    
    public void save(Person person){
        persons.add(person);
    }
}
