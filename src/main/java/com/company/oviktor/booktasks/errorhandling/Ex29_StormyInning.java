package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

class BaseballException extends RuntimeException {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

class UmpireArgument extends BaseballException {
}

abstract class Inning {
    public Inning() {
    }

    public void event() {

    }

    public abstract void atBat();

    public void walk() {
    }

    public abstract void decision();
}

class StormException extends RuntimeException {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event();

    public void rainHard();
}

@Slf4j
public class Ex29_StormyInning extends Inning implements Storm {

    public Ex29_StormyInning() {
    }

    public Ex29_StormyInning(String s)
            throws Foul, BaseballException {
    }

    public void walk() {
    }

    @Override
    public void decision() {

    }

    public void rainHard() {
    }

    public void atBat() {
        throw new Foul();
    }


    public static void main(String[] args) {

        Ex29_StormyInning si = new Ex29_StormyInning();
        si.atBat();
        si.decision();


    }
}
