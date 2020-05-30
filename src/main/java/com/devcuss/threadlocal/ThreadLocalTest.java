package com.devcuss.threadlocal;

public class ThreadLocalTest {
    public static void main(String[] args) {
        Task task = new Task();
        for (int i = 0; i < 3; i++) {
            new Thread(() -> System.out.println(Thread.currentThread().getName() + " : " + task.calc(10))).start();
        }
    }

    static class Task {
        private int value;

        public int calc(int i) {
            value += i;
            return value;
        }
    }
}
