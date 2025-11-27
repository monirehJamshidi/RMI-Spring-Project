package org.j2os;

import java.io.Serializable;

public class Person implements Serializable {
    public Person(){
        System.out.println("create new instance from person class");
    }
    private String name;
    private String family;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Person setFamily(String family) {
        this.family = family;
        return this;
    }
}
