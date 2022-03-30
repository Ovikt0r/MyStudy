package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;

@Slf4j
class Command {
    String line;

    Command(String line) {
        this.line = line;
    }
    public  void operation () {
        log.info(line);
    }
}

class Producer {
    public static void produce (Queue<Command> q) {
        q.offer(new Command("Lion"));
        q.offer(new Command("Tiger"));
        q.offer(new Command("Puma"));
        q.offer(new Command("Cat"));
        q.offer(new Command("Manul"));
    }
}

class Consumer {
    public static void consume(Queue<Command> q) {
        while (q.peek() != null) {
            q.remove().operation();
        }
    }
}

public class Ex27 {
    public static void main(String[] args) {
        Queue<Command> queue = new LinkedList<>();
        Producer.produce(queue);
        Consumer.consume(queue);
    }
}
