package org.j2os;

public class Main {
    public static void main(String[] args) {
        Person person = (Person) Spring.getInstance("person");
        System.out.println(person.getName() + " " + person.getFamily());
    }
}
