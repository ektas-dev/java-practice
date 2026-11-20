package com.practice.athread;

public class Task2 implements Runnable  {
	public void print() {
		System.out.println("Executing task 2. "+ Thread.currentThread().getName());
	}

	@Override
	public void run() {
		print();
	}
}
