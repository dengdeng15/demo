package com.example.demo.test;

import java.text.BreakIterator;
import java.util.Scanner;

public class JavaTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("This is a. test string");
        scanner.useDelimiter("[ .]");
        while (scanner.hasNext()) {
            System.out.println(scanner.next().trim());
        }

        BreakIterator wordIterator = BreakIterator.getWordInstance();
        String text = "This is a. test string";
        wordIterator.setText(text);
        int boundary = wordIterator.first();
        while (boundary != BreakIterator.DONE) {
            int begin = boundary;
            boundary = wordIterator.next();
            int end = boundary;
            System.out.println(begin + "-" + end);
            if (end == BreakIterator.DONE) break;
            System.out.println(text.substring(begin, end));
        }
    }
}
