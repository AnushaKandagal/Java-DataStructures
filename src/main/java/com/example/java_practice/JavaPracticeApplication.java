package com.example.java_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.java_practice.DataStructures.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class JavaPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaPracticeApplication.class, args);

        System.out.println("Performing arrayList operations");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,4));
        ArrayListPractice arrayListPractice = new ArrayListPractice(list);
        arrayListPractice.performArrayListOperations();



    }


}
