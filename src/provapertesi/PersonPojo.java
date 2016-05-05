/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapertesi;

/**
 *
 * @author fabiano
 */
public class PersonPojo {

    public PersonPojo(String name, String lastName, int birthYear) {
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
 
    
    
    private String name;
    private String lastName;
    private int birthYear;
}