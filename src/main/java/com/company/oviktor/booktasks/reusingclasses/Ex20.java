package com.company.oviktor.booktasks.reusingclasses;


class WithFinals {
    private final void f() {
        System.out.println("WithFinals.f()");
    }
    private void g() {
        System.out.println("WhithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {

    @Override
    public final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    @Override
    public void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    @Override
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    @Override
    public void g() {
        System.out.println("OverridingPrivate.g()");
    }
}
public class Ex20 {
}
