package com.company.oviktor.booktasks.errorhandling;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

class UmpireArgument extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul, UmpireArgument;

    public void walk() {
    } // Throws no checked exceptions

    public abstract void decision() throws UmpireArgument;
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

@Slf4j
public class Ex20_StormyInning extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public Ex20_StormyInning()
            throws RainedOut, BaseballException {
    }

    public Ex20_StormyInning(String s)
            throws Foul, BaseballException {
    }

    // Regular methods must conform to base class:
// public void walk() throws PopFoul {} //Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
//! public void event() throws RainedOut {}
    // If the method doesn't already exist in the
    // base class, the exception is OK:
    public void rainHard() throws RainedOut {
    }
    // You can choose to not throw any exceptions,

    // even if the base version does:
    public void event() {
    }

    // Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul, UmpireArgument{
        throw new UmpireArgument();
    }

    @Override
    public void decision() throws UmpireArgument {
        throw new UmpireArgument();
    }

    public static void main(String[] args) {
        try {
            Ex20_StormyInning si = new Ex20_StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            log.info("Pop foul");
        } catch (RainedOut e) {
            log.info("Rained out");
        } catch (BaseballException e) {
            log.info("Generic exception");
        }
        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new Ex20_StormyInning();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:
        } catch (Strike e) {
            log.info("Strike");
        } catch (Foul e) {
            log.info("Foul");
        } catch (RainedOut e) {
            log.info("Rained out");
        } catch (BaseballException e) {
            log.info("Generic baseball exception");
        }
        try {
            Ex20_StormyInning si = new Ex20_StormyInning();
            si.atBat();
            si.decision();
        } catch (PopFoul e) {
            log.info("Pop foul");
        } catch (RainedOut e) {
            log.info("Rained out");
        } catch (UmpireArgument e) {
            log.info("Umpire argument !");
        } catch (BaseballException e) {
            log.info("Generic baseball exception");
        }

    }
}
