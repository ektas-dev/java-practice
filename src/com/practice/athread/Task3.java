package com.practice.athread;

public class Task3 implements Runnable  {
	public void print() {
		System.out.println("Executing task 3. " + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		print();
	}
}
