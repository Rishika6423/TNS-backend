package com.tnsif.collectionsdemo;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> dq=new PriorityQueue<String>();
		dq.add("harsha");
		dq.add("siri");
		dq.add("bobby");
		dq.add("varsha");
		for(String names:dq) {
			System.out.println(names);
		}
		PriorityQueue<Integer> d=new PriorityQueue<Integer>();
		d.add(123);
		d.add(789);
		d.add(345);
		d.add(65);
		for(Integer num:d) {
			System.out.println(num);
		}
	}
}