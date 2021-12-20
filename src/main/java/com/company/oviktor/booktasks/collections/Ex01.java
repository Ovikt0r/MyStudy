package com.company.oviktor.booktasks.collections;

import java.util.ArrayList;

class Gerbil {
    private final int gerbilNumber;

    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public String toString() {
        return gerbilNumber + " gerbils";
    }

    public void hop() {
        System.out.println(this + " is hopping");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
    }

}
