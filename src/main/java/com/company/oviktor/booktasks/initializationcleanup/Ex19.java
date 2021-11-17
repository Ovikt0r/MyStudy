package com.company.oviktor.booktasks.initializationcleanup;

public class Ex19 {

    public void printArgStrings (String...args){
        for(String s:args){
            System.out.print(s+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ex19 instance = new Ex19();
        instance.printArgStrings("Take", "the", "String", "array", "divided", "by", "coma");
        instance.printArgStrings(new String[] {"Take","the", "array", "of", "strings"});
    }
}
