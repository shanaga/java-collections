package com.practice.list;

public class Generics<T> {  // After compilation, it will replaced like this :

    T obj; // Unbounded type example // Here, T will be replaced by default i.e. Object obj;
    Generics(T o) { // Generics(Object o)
        obj = o;
    }
    T getObj() { //Object getObj()
        return obj;
    }

}

class Generics1<T extends String> { // Example of bounded type, //Here, T will be replaced by String i.e. java.lang.String
    T str; // String str;

    Generics1(T o) { // Generics1(String o)
        str = o;
    }

    T getObj() { // String getObj()
        return str;
    }
}
