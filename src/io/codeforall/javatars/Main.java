package io.codeforall.javatars;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Range r = new Range(-5, 5);

        System.out.println("Using Iterator");
        Iterator<Integer> it = r.iterator();

        while (it.hasNext()){
            it.remove();
            System.out.println(it.next());
        }

    }
}
