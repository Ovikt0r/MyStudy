package com.company.oviktor.booktasks.accesscontrol.inpackage;
import java.util.*;

class Vector {
    String direction;
    Vector(String direction){
        this.direction = direction;
        System.out.println("This line is directed to : " + direction);
    }
}

public class Ex02 {

    public static void main(String[] args) {

    java.util.Vector v1 = new java.util.Vector(3,2);
    Vector v2 = new Vector("right");
    }
}
