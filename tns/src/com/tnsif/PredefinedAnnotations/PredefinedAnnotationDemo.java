package com.tnsif.PredefinedAnnotations;

import java.util.ArrayList;
import java.util.List;

public class PredefinedAnnotationDemo {

    public static void main(String[] args) {
        List<Object> al = new ArrayList<>();
        al.add(10);
        al.add(22.22f);
        al.add(new Student(109, "Ram", "CS", 9.7f, 18));
        al.add("SKSJIT");
        al.add(null);
        for (Object o : al) {
            System.out.println(o);
        }
    }
}