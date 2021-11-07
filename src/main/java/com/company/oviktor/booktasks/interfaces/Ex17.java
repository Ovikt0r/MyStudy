package com.company.oviktor.booktasks.interfaces;


class ChangeColorTest implements TestInterface {

    //The try to change the fields gives a compile error:
    // red_color = "BLUE";
    // blue_color = "RED";

}

public class Ex17 extends ChangeColorTest{

    public static void main(String[] args) {
        System.out.println(RED_COLOR + " " + BLUE_COLOR);
    }
}
