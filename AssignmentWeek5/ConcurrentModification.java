package week5;

import java.util.*;

import java.util.concurrent.*;
class ConcurrentModification {
 public static void main(String[] args)
 {
     ConcurrentHashMap m = new ConcurrentHashMap();
     m.put(100, "Hello");
     m.put(101, "Hi");
     m.put(102, "Hi");

     m.putIfAbsent(101, "Hello");

     m.remove(101, "Hi");

     m.putIfAbsent(103, "Hello");

     m.replace(101, "Hello", "For");
     System.out.println(m);
 }
}