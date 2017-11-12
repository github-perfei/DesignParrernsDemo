package com.templateMethod.testpaper;

public abstract class TestPaper {
    public void testQuestion1(){
        System.out.println("问题一：aaaaaa");
        System.out.println("答案为：" + answer1());
    }

    public void testQuestion2(){
        System.out.println("问题二：bbbbbb");
        System.out.println("答案为：" + answer2());
    }

    public void testQuestion3(){
        System.out.println("问题三：cccccc");
        System.out.println("答案为：" + answer3());
    }

    protected abstract String answer1();
    protected abstract String answer2();
    protected abstract String answer3();
}
