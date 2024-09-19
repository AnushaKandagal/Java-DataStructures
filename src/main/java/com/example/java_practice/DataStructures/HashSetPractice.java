package com.example.java_practice.DataStructures;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetPractice {

    // implements set interface
    HashSet<Integer> hashSet = new HashSet<Integer>();

    public HashSetPractice(HashSet<Integer> hashSet) {
        this.hashSet = hashSet;
    }

    public HashSet<Integer> getHashSet() {
        return hashSet;
    }
    public void setHashSet(HashSet<Integer> hashSet) {
        this.hashSet = hashSet;
    }

    public void insert(int value) {
        hashSet.add(value);
    }

    public void insertList(ArrayList<Integer> list){
        hashSet.addAll(list);
    }

    public void printHashSet() {
        System.out.println(hashSet);
    }

    public void performHashSet(){
        System.out.println("Inserting a value 9");
        hashSet.add(9);

        System.out.println("Inserting duplicate 9");
        hashSet.add(9);

        System.out.println("Inserting a list of elements");
        AbstractList<Integer> arrayList = new ArrayList();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        hashSet.addAll(arrayList);

        this.printHashSet();
        System.out.println("size of hashSet: " + hashSet.size());
    }

}
