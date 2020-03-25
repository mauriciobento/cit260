package view;


import exceptions.PersonException;
import model.Address;
import model.Person;
import service.PersonService;
import service.impl.PersonServiceImpl;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainPage {

    private PersonService personService = new PersonServiceImpl();
    /**
     *
     */
    public void init(){
        println("_____________________________________\n");
        //menu option
        int option = new Integer(input("0 - Exit | 1 - Person: "));
        switch (option){
            case 0:
                println("Good bye...");
                System.exit(0);
                break;
            case 1:
                personMenu();
                break;
            case 2:
                showAllPeople();
                break;
            default:
                println("Option invalid.");
        }
        init();
    }

    private void personMenu(){
        int option = new Integer(input("0 - Back | 1 - Create a new Person | 2 - Show All People : "));
        switch (option){
            case 0:
                init();
                break;
            case 1:
                createPerson();
                personMenu();
                break;
            case 2:
                showAllPeople();
                personMenu();
                break;
            default:
                println("Option invalid.");
                personMenu();
        }
    }

    /**
     *
     */
    private void createPerson(){
        println("\n########## Person Form ##########\n");
        //new Person
        Person person = new Person(input("Full name: "));
        person.setId(new Random().nextInt(99999999));
        //new Address
        person.setAddress(new Address());
        person.getAddress().setStreet(input("Address - street: "));
        person.getAddress().setZip(input("Address - zip: "));
        person.getAddress().setCity(input("Address - city: "));
        person.getAddress().setState(input("Address - state: "));
        try {
            //save person
            personService.savePerson(person);
            println("Person saved successfully.");
        } catch (PersonException e) {
            e.printStackTrace();
        }
    }

    private void showAllPeople(){
        try {
            List<Person> personList = personService.findAllPerson();
            for (Person person : personList){
                println("");
                println("Full Name       | Street     | ZIP      |City       |State");
                System.out.printf("%-17s %-12s %-9s %-11s %s %n%n",
                        person.getFullName(),
                        person.getAddress().getStreet(),
                        person.getAddress().getZip(),
                        person.getAddress().getCity(),
                        person.getAddress().getState());


                /*println(person.getFullName()+"        " +
                        person.getAddress().getStreet()+"      "+
                        person.getAddress().getZip()+"       " +
                        person.getAddress().getCity()+"      " +
                        person.getAddress().getState());*/
            }
        }catch (PersonException e){
            e.printStackTrace();
        }
    }

    /**
     * @param message
     * @return
     */
    private String input(String message) {
        Scanner myObj = new Scanner(System.in);
        System.out.print(message);
        return myObj.nextLine();
    }

    /**
     * @param value
     */
    private void println(Object value) {
        System.out.println(value);
    }
}
