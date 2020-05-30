package com.devcuss.threadlocal;

public class ThreadLocalTest3 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Task().calc(10);
            if (i == 80) {
                System.gc();
            }
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
