package com.company.oviktor.booktasks.errorhandling;


import lombok.extern.slf4j.Slf4j;

class Annoyance extends RuntimeException {
}

class Sneeze extends Annoyance {
}

@Slf4j
public class Ex30_Human {

    public static void turnRunTime(int i) {
        try {
            switch (i) {
                case 0:
                    throw new Annoyance();
                case 1:
                    throw new Sneeze();
                case 2: throw new RuntimeException("Where am I ?");
                default:
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++)
            try {
                turnRunTime(i);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (Sneeze e) {
                    log.error("Caught Sneeze");
                } catch (Annoyance e) {
                    log.error("Caught Annoyance");
                } catch (Throwable t) {
                    log.error(t.toString());
                }
            }
    }
}
