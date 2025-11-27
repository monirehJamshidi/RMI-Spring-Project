package org.j2os;

import java.rmi.server.UnicastRemoteObject;

public class PersonProviderUniast extends UnicastRemoteObject implements PersonProviderRemote {
    public PersonProviderUniast() throws Exception{}
    @Override
    public Person getPersonFromRemote() throws Exception {
        Person person = new Person();
        person.setName("Monireh");
        person.setFamily("Jamshidi");
        return person;
    }
}
