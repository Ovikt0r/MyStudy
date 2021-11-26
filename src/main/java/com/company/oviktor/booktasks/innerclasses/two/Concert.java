package com.company.oviktor.booktasks.innerclasses.two;

import com.company.oviktor.booktasks.innerclasses.one.Singer;

public class Concert {
    protected class PartOne implements Singer {

        public PartOne() {}
        public void boo() {
            System.out.println("Say BOO");
        }
    }
}
