package org.ccasro.level2.exercise2;

public class GenericMethods {

    @SafeVarargs
    public static <T> void showArgs(String arg1, T... args){
        System.out.println("Arg1: " + arg1);

        T[] copy = args.clone();

        for(T arg : copy){
            System.out.println(" - " + arg);
        }
    }
}
