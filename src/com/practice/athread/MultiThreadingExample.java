package com.practice.athread;

public class MultiThreadingExample {
	public static void main(String[] args) throws InterruptedException {
		// multi-threading achieved through two parts
		// by extending thread or implementing runnable
//		Task1 task1 = new Task1();
//		Task2 task2 = new Task2();
//		Task3 task3 = new Task3();

		// Normally
//		task1.print();
//		task2.print();
//		task3.print();

		// Extending thread
//		task1.start();
//		task2.start();
//		task3.start();

		// Implementing Runnable
		Thread t1 = new Thread(new Task1());
		Thread t2 = new Thread(new Task2());
		Thread t3 = new Thread(new Task3());

		t1.start();
		t2.start();
		t3.start();

		// Using lambda expression
		Thread ta = new Thread(() -> System.out.println("Executing task 4 " + Thread.currentThread().getName()));
		Thread tb = new Thread(() -> System.out.println("Executing task 5 " + Thread.currentThread().getName()));
		Thread tc = new Thread(() -> System.out.println("Executing task 6 " + Thread.currentThread().getName()));

		ta.start();
		tb.start();
		tc.start();

		// Important methods of thread
		System.out.println("Hello ");
		Thread.sleep(5000);
		System.out.println("How are you?");

		Thread ta1 = new Thread(() -> {
			System.out.println("Task 1");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

			}
		});
		Thread ta2 = new Thread(() -> {
			System.out.println("Task 2");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

			}
		});
		Thread ta3 = new Thread(() -> {
			System.out.println("Task 3");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

			}
		});

		ta1.start();
		ta2.start();
		ta3.start();

		ta1.join();
		ta2.join();
		ta3.join();

		System.out.println("Main method continues");

	}
}
