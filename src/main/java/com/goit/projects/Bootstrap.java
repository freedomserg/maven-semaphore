package com.goit.projects;

public class Bootstrap {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new SemaphoreImpl(1);
        new Worker(semaphore, "Adder", true).start();
        Thread.sleep(100);
        new Worker(semaphore, "Reducer", false).start();
    }
}
