package com.devcuss.threadlocal;

public class ThreadLocalTest2 {
    public static void main(String[] args) {
        ThreadLocalTest2.Task task = new ThreadLocalTest2.Task();
        for (int i = 0; i < 3; i++) {
            new Thread(() -> System.out.println(Thread.currentThread().getName() + " : " + task.calc(10))).start();
        }
    }

    static class Task {
        ThreadLocal<Integer> value;

        public int calc(int i) {
            value = new ThreadLocal();
            value.set((value.get() == null ? 0 : value.get()) + i);
            return value.get();
        }
    }
}
