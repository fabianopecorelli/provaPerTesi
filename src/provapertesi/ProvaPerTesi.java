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
public class ProvaPerTesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonPojo person = new PersonPojo("Fabiano","Pecorelli",1991);
        System.out.println(person.getName() + " - " + person.getLastName());
    }
    
}
