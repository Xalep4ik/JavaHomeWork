package com.pb.kh.hw13;

import java.util.LinkedList;
import java.util.Random;

public class ProdCons {

    static class Producer extends Thread {
        private final LinkedList<Integer> buffer;
        private final int maxSize;

        public Producer(LinkedList<Integer> buffer, int maxSize) {
            this.maxSize = maxSize;
            this.buffer = buffer;

        }

        @Override
        public void run() {
            while (true) {
                synchronized (buffer) {
                    while (buffer.size() == maxSize) {
                        try {
                            System.out.println("Ждем чтобы положить ");
                            buffer.wait();
                        } catch (InterruptedException i) {
                            i.printStackTrace();
                        }
                    }
                    Random r = new Random();
                    int x = r.nextInt(10);
                    System.out.println("Произведим :" + x);
                    buffer.add(x);
                    buffer.notify();
                }
            }
        }
    }

    static class Consumer extends Thread {
        private final LinkedList<Integer> buffer;
        private final int maxSize;


        public Consumer(LinkedList<Integer> buffer, int maxSize) {
            this.maxSize = maxSize;
            this.buffer = buffer;
        }

        @Override
        public void run() {

            while (true) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            System.out.println("Ждем чтобы что-то взять");
                            buffer.notify();
                            buffer.wait();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    while (!buffer.isEmpty()) {
                        System.out.println("Берем :" + buffer.remove());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> buffer = new LinkedList<>();
        final int maxSize = 5;
        Thread producer = new Producer(buffer, maxSize);
        Thread consumer = new Consumer(buffer, maxSize);

        producer.start();
        consumer.start();


    }


}
