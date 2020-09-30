/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.util.ArrayList;
import com.models.Person;
import com.services.PersonService;
/**
 *
 * @author jsme4
 */
public class PersonController {
    public ArrayList<Person> index(){
        PersonService personService = new PersonService();
        
        return personService.getAll();
        
    }
    
     public Person show(int id) {
        PersonService personService = new PersonService();
        return personService.get(id);
    }
     
     public Person showByEmail(String email) {
        PersonService personService = new PersonService();
        return personService.getByEmail(email);
    }
}
