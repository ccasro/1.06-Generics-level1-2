package org.ccasro.level2.exercise2;

import org.ccasro.level1.Person;

public class MainEx2 {
    public static void main(String[] args) {

        Person p1 = new Person("Cesar", "Dominguez", 30);

        GenericMethods.showArgs("Test", p1, "Always String");
        GenericMethods.showArgs("Test2", new Person("Oliver", "cas", 10), "Always String",23.5);
    }
}
