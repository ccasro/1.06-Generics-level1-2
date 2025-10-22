package org.ccasro.level2.exercise1;

import org.ccasro.level1.Person;

public class MainEx1 {
    public static void main(String[] args) {

        Person p1 = new Person("Cesar", "Dominguez", 30);

        GenericMethods.showArgs(p1, "Hi", "Always String");
        GenericMethods.showArgs(40,new Person("Oliver","cas",10),"Always String");
    }
}
