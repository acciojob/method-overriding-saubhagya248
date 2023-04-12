package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        String before = obj.meth();
        System.out.println(before);
        String after = obj.meth();
        System.out.println(after);
    }
}
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    @Override
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}