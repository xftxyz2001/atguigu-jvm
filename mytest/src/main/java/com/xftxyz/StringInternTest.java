package com.xftxyz;

/**
 * 总结String的intern()的使用：
 * jdk1.6中，将这个字符串对象尝试放入串池。
 * - 如果串池中有，则并不会放入。返回已有的串池中的对象的地址
 * - 如果没有，会把此对象复制一份，放入串池，并返回串池中的对象地址
 * 
 * jdk1.7起，将这个字符串对象尝试放入串池。
 * - 如果串池中有，则并不会放入。返回已有的串池中的对象的地址
 * - 如果没有，则会把对象的引用地址复制一份，放入串池，并返回串池中的引用地址
 */
public class StringInternTest {

    public static void main(String[] args) {
        test1(); // true
        new StringInternTest().test2(); // false
    }

    private static void test1() {
        String a = new String("1") + new String("1");
        a.intern();
        String b = "11";
        System.out.println(a == b);
    }

    private void test2() {
        String a = new String("1") + new String("1");
        a.intern();
        String b = "11";
        System.out.println(a == b);
    }

}