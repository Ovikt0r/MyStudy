package com.company.oviktor.innerclasses;

public class Ex03_Outer {

    private String address;

    Ex03_Outer(String address) {
        this.address = address;
    }

    public Inner returnInner() {
        return new Inner();
    }

    class Inner {
        public String toString() {
            return address;
        }
    }


    public static void main(String[] args) {
        Ex03_Outer o = new Ex03_Outer("Gorkogo street");
        Ex03_Outer.Inner inner = o.returnInner();
        System.out.println(inner);
    }
}
