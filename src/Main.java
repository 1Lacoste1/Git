//package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/*
Замена знаков
*/

public class Main {
    public static void main(String[] s) {
        A a = new C();
        a.method2();
    }

    public static class A {
        public void method1() {
            System.out.println("A class, method1");
        }

        public void method2() {
            System.out.println("A class, method2");
        }
    }

    public static class B extends A {
        public void method1() {
            System.out.println("B class, method1");
        }

        public void method2() {
            System.out.println("B class, method2");
        }
    }

    public static class C extends B {
        public void method1() {
            System.out.println("C class, method1");
        }

        public void method2() {
            System.out.println("C class, method2");
            System.out.println("Hello world");
        }
    }
    }
