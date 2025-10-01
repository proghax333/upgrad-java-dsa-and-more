package org.proghax333.class_25sept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDeepCopy {
    static <K, V> Map<K, V> hashMapDeepCopy(Map<K, ? extends Copyable<V>> map) {
        HashMap<K, V> copyMap = new HashMap<>();

        for(var x : map.entrySet()) {
            copyMap.put(x.getKey(), x.getValue().copy());
        }

        return copyMap;
    }

    public static void main(String[] args) {

        Person aditya = new Person("Aditya", 25);
        Person atmanand = new Person("Atmanand", 25);
        Person sameer = new Person("Sameer", 25);

        Map<Integer, Person> map = new HashMap<>();

        map.put(1, aditya);
        map.put(2, atmanand);
        map.put(3, sameer);

        Map<Integer, Person> copied = hashMapDeepCopy(map);

        Person atmanandCopy = copied.get(2);
        atmanandCopy.setName("Atmanand Copy");

        System.out.println("Atmanand's name: " + atmanand.getName());
        System.out.println("Atmanand's Copy's name: " + atmanandCopy.getName());
    }
}
