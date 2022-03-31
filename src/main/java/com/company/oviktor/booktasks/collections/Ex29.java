package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.PriorityQueue;

class Iggy {

}
@Slf4j
public class Ex29 {
    public static void main(String[] args) {
        PriorityQueue<Iggy> priorityQueue = new PriorityQueue<>();
        log.info("First instance adding: ");
        priorityQueue.offer(new Iggy());
        log.info("Second instance adding: ");
        priorityQueue.offer(new Iggy());


    }
}
