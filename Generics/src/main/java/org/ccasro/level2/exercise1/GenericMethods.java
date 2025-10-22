package org.ccasro.level2.exercise1;

public class GenericMethods {
        public static <T, U> void showArgs(T arg1,U arg2,String arg3){
            System.out.println("Arg1: " + arg1);
            System.out.println("Arg2: " + arg2);
            System.out.println("Arg3: " + arg3);
        }
}
