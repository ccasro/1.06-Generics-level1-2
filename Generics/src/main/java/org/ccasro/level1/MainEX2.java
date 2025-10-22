package org.ccasro.level1;

public class MainEX2 {

    public static void main(String[] args) {

        Person p1 = new Person("Cesar", "Dominguez", 30);

        GenericMethods.showArgs(p1, "Hi", 10);
        GenericMethods.showArgs(40,new Person("Oliver","cas",10),"Romeo");
    }
}
