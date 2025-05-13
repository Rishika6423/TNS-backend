package com.tnsif.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StudentsListMethods {
	public static void main(String[] args) {
        // Create a list to store student names
        List<String> students = new ArrayList<>();

        // 1. boolean isEmpty()
        System.out.println("Is the list empty? " + students.isEmpty());

        // 2. boolean add(E e)
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");
        System.out.println("Students after adding: " + students);
        System.out.println("Is the list empty? " + students.isEmpty());
        
        // 3. int size()
        System.out.println("Total number of students: " + students.size());

        // 4. boolean contains(Object o)
        System.out.println("Is 'Charlie' in the list? " + students.contains("Charlie"));

        // 5. E get(int index)
        System.out.println("Student at index 2:" + students.get(2));

        // 6. boolean remove(Object o)
        students.remove("Bob");
        System.out.println("After removing 'Bob':" + students);

        // 7. Object[] toArray()
        Object[] studentArray = students.toArray();
        System.out.println("Students as array: ");
        for (Object s : studentArray) {
            System.out.println(s);
        }

        // 8. Iterator<E> iterator()
        System.out.println("Using Iterator to display students:");
        Iterator<String> itr = students.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 9. boolean retainAll(Collection<?> c)
        List<String> selectedStudents = Arrays.asList("Alice", "Diana");
        students.retainAll(selectedStudents);
        System.out.println("After retainAll : " + students);

        // 10. void clear()
        students.clear();
        System.out.println("Is the list empty? " + students.isEmpty());
    }
}