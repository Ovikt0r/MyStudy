package com.company.oviktor.booktasks.collections;

import java.util.ArrayList;
import java.util.Iterator;

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

public class Ex08 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        Iterator<Gerbil> it = gerbils.iterator();
        while (it.hasNext()) {
            Gerbil gerbil = it.next();
            gerbil.hop();
        }

    }

}
