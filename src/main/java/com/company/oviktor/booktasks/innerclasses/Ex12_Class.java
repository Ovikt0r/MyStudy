package com.company.oviktor.booktasks.innerclasses;

public class Ex12_Class {

    private String garage = "Street avenue";
    private void showMeGarage() {
        System.out.println(garage);
    }
    void thirdSide () {
        new Object() {
            void change() {
                garage = garage + " and boulevard";
                showMeGarage();
            }
        }.change();
    }

    public static void main(String[] args) {
        new Ex12_Class().thirdSide();
    }
}
