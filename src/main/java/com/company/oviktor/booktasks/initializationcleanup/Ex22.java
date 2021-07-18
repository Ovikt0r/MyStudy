package com.company.oviktor.booktasks.initializationcleanup;

public class Ex22 {

    public enum PaperMoneyType{ONE,TWO,FIVE,TEN,TWENTY,FIFTY}

    static void describe(PaperMoneyType pmt) {
        System.out.print(pmt + " has a portrait of ");
        switch (pmt){
            case ONE -> System.out.println("Volodymyr Veliky");
            case TWO -> System.out.println("Yaroslav Mudry");
            case FIVE -> System.out.println("Bogdan Khmelnitsky");
            case TEN -> System.out.println("Ivan Mazepa");
            case TWENTY -> System.out.println("Ivan Franko");
            case FIFTY -> System.out.println("Volodymyr Grushevsky");
        }
    }
    public static void main(String[] args) {
        for(PaperMoneyType s:PaperMoneyType.values()){
            describe(s);
        }
    }
}
