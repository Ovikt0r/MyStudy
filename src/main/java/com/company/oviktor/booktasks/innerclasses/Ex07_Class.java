package com.company.oviktor.booktasks.innerclasses;

public class Ex07_Class {

    private String garage = "Street avenue";
    private void showMeGarage() {
        System.out.println(garage);
    }

    void thirdSide () {
        new InnerCl().change();
    }
    class InnerCl {
        void change(){
            garage = garage + " and boulevard";
            showMeGarage();
        }
    }

    public static void main(String[] args) {
        new Ex07_Class().thirdSide();
    }
}
