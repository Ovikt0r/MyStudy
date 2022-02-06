package com.company.oviktor.booktasks.collections;

import java.util.*;

public class Controller {

    private final List<Event> eventList = new LinkedList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        Iterator<Event> it = new LinkedList<>(eventList).iterator();
        while (it.hasNext()) {
            Event e = it.next();
            if (e.ready()) {
                System.out.println(e);
                e.action();
                eventList.remove(e);
            }
        }
    }
}