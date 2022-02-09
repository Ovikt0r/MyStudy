package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;


import java.util.*;
@Slf4j
class Gerbil {
    private final int gerbilNumber;

    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public String toString() {
        return gerbilNumber + " gerbils";
    }

    public void hop() {
        log.info(this + " is hopping");
    }
}

@Slf4j
public class Ex17 {

    static String[] names = {"Bob", "Jimmy", "Sarah", "Antony", "Yasha", "Bread", "Tom", "Amelly", "John", "Peter"};

    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<>();
            gerbilMap.put(names[0], new Gerbil(0));
            gerbilMap.put(names[1], new Gerbil(1));
            gerbilMap.put(names[2], new Gerbil(2));
            gerbilMap.put(names[3], new Gerbil(3));
            gerbilMap.put(names[4], new Gerbil(4));
            gerbilMap.put(names[5], new Gerbil(5));
            gerbilMap.put(names[6], new Gerbil(6));
            gerbilMap.put(names[7], new Gerbil(7));
            gerbilMap.put(names[8], new Gerbil(8));
            gerbilMap.put(names[9], new Gerbil(9));

            Iterator<String> it = gerbilMap.keySet().iterator();
            while (it.hasNext()) {
                String s = it.next();
                log.info(s + ": ");
                gerbilMap.get(s).hop();
            }
    }

}

