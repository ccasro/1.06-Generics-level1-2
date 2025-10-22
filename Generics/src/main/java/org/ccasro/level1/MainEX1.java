package org.ccasro.level1;

public class MainEX1 {
    public static void main(String[] args){

        NoGenericMethods ex1 = new NoGenericMethods("1","2","3");
        NoGenericMethods ex2 = new NoGenericMethods("3","1","2");
        NoGenericMethods ex3 = new NoGenericMethods("2","3","1");

        System.out.println(ex1 + " " +  ex2 + " " + ex3);
    }
}
