package com.practice.athread;

public class Task1 implements Runnable {
	public void print() {
		System.out.println("Executing task 1." + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		print();
	}
}
