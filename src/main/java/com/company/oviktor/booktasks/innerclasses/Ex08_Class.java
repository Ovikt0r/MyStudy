package com.company.oviktor.booktasks.innerclasses;

class Out {
    class Inner {
        private int i;

        private void f() {
            System.out.println("Enought");
            System.out.println("Just khjhkjkhk" + i);
        }
    }

    public void testAccess() {
        Inner inner = new Inner();
        inner.i = 34;
        inner.f();
    }
}

public class Ex08_Class {
    public static void main(String[] args) {
        Out out = new Out();
        out.testAccess();
    }
}

