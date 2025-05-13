package com.tnsif.collectionsdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("AIML", 69);
		m.put("DS", 78);
		m.put("CS", 65);
		m.put("CC", 80);
		m.put("OS", 75);
		for(Entry<String, Integer> entry:m.entrySet()) {
			System.out.println("Subject "+entry.getKey()+" Marks "+entry.getValue());
		}
	}

}
