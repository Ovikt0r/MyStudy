package com.company.oviktor.booktasks.initializationcleanup;

public class Ex21 {

    public enum PaperMoneyType {ONE,TWO,FIVE,TEN,TWENTY,FIFTY}

    public static void main(String[] args) {
        for (PaperMoneyType s:PaperMoneyType.values()){
            System.out.println(s + " ordinary " + (s.ordinal() +1) );
        }
    }
}
