package com.jacekkuchta.test;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Random;

public class TestApp {
    public static void main (String[] args) {
        ArrayDeque<String> letters = new ArrayDeque<String>();

        Random generator = new Random();
        //String s = "" + 'a';
        String napis = "";
        for(int i=1; i <= 50; i++) {
            int liczba = generator.nextInt(49)+1;
            System.out.println("\nWylosowalem: " + liczba);

            for(int j=1; j<=liczba; j++) {
                napis += 'a';
            }

            System.out.print(napis);
            letters.offer(napis);
            napis = "";
        }

        System.out.println("\n\nRozmiar Tablicy: " + letters.size());

        Iterator itr = letters.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

        MyClass tester = new MyClass();
//        tester.printEven(letters.to);
    }
}
