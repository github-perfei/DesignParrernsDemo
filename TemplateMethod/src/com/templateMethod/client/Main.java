package com.templateMethod.client;

import com.templateMethod.testpaper.TestPaper;
import com.templateMethod.testpaper.TestPaperA;
import com.templateMethod.testpaper.TestPaperB;

public class Main {
    public static void main(String[] args){
        TestPaper testPaperA = new TestPaperA();

        System.out.println("TestPaper A :");
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        TestPaper testPaperB = new TestPaperB();

        System.out.println("TestPaper B :");
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();
    }
}
