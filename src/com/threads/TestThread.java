package com.threads;

import java.util.concurrent.*;

public class TestThread {
    public static void main(String[] args) {
//        Thread t = new MyThread();
//        t.start();
//        Runnable myThread1 = new MyThread1();
//        Thread t1 = new Thread(myThread1);
//        t1.start();
//        myThreadPoolExecutor();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 10; i++) {
            executor.submit(() -> {
                System.out.println("thread id is: " + Thread.currentThread().getId());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
    }

    public static void myThreadPoolExecutor() {
        // 创建线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 100, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10));
        // 执行任务
        for(int i = 0; i < 10; i++) {
            final int index = i;
            threadPool.execute(() -> {
                System.out.println(index + " 被执行,线程名:" + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("This is MyThread");
    }
}

class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("This is MyThread1");
    }
}
