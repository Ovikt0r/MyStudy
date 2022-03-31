package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.PriorityQueue;
import java.util.Random;

@Slf4j
public class Ex28 {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        Random random = new Random(25);
        for(int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextDouble());
            while (priorityQueue.peek() != null) {
                log.info(String.valueOf(priorityQueue.poll()));
            }
        }

    }
}
