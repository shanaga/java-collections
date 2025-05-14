package com.practice.programs;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        hashtable.put(10, "abc");
        hashtable.put(10, "xyz");
        hashtable.put("k1", 200);
        hashtable.put("k1", "test");
        hashtable.put(new M(10), 200);
        hashtable.put(new M(90), 300);


        System.out.println(hashtable);



    }

    static class M {
        int i;
        M (int i) {
            this.i = i;
        }

        public String toString() {
            return "(i=" + i + ")";
        }
    }
}
