package com.example.java_practice.DataStructures;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Component
public class ArrayListPractice {
    ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();

    public ArrayListPractice(ArrayList<Integer> listOfIntegers) {
        this.listOfIntegers = listOfIntegers;
    }

    public ArrayList<Integer> getListOfIntegers() {
        return listOfIntegers;
    }

    public void setListOfIntegers(ArrayList<Integer> listOfIntegers) {
        this.listOfIntegers = listOfIntegers;
    }

    public void insertElements(int a){
        listOfIntegers.add(a);
    }

    public void insertListOfIntegers(ArrayList<Integer> a){
        listOfIntegers.addAll(a);
    }

    public void insertCollectionOfIntegers(Collection<Integer> a){
        listOfIntegers.addAll(a);
    }

    public void insertElementAtPosition(int a, int position){
        listOfIntegers.add(position, a);
    }

    public void insertListOfIntegersAtPosition(ArrayList<Integer> list,int position){
        listOfIntegers.addAll(position, list);
    }

    public void checkIfContains(Integer a){
        if(listOfIntegers.contains(a)){
            System.out.println("Contains element");
        }else {
            System.out.println("Not contains element");
        }
    }

    public void printListOfIntegers(){
        for(Integer i : listOfIntegers){
            System.out.println(i);
        }
    }

    public void printList(){
        System.out.println(listOfIntegers);
    }

    public void performArrayListOperations(){
        this.printList();

        System.out.println("add element 0 in ArrayList");
        this.listOfIntegers.add(0);
        this.printList();

        System.out.println("add element 9 at position 0 in ArrayList");
        this.insertElementAtPosition(9,0);
        this.printList();

        System.out.println("add list 7,8,9 in ArrayList");
        this.insertListOfIntegers(new ArrayList<>(Arrays.asList(7,8,9)));
        this.printList();

        System.out.println("add collection 1,2,3 of integers in ArrayList");
        this.insertCollectionOfIntegers(Arrays.asList(1,2,3));
        this.printList();

        System.out.println("add list 11,12,13 at position 1 in ArrayList");
        this.insertListOfIntegersAtPosition(new ArrayList<>(Arrays.asList(7,8,9)),1);
        this.printList();

        System.out.println("check if contains 6");
        this.checkIfContains(6);



    }
}
