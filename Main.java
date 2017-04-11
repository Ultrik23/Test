package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Integer integer = new Integer(1);
        String s = new String("asd");
        boolean b = true;

        Gen genInt = new Gen(new Fruit());
        Gen genStr = new Gen(new Apple());
        Gen<? super RedApple> genBool = new Gen(new RedApple());

    }
}

/////////////////////////////
//class Gen1<T super Fruit>{}
class Gen<T extends Fruit>{
    T ob;

    public Gen() {
    }

    public Gen(T ob) {
        this.ob = ob;
    }
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println(ob.getClass().getSimpleName());
    }
}
class GenTry<T extends Collections>{}
class Fruit{
    void method(){
        System.out.println("Метод фруктов");
    }
}
class Apple extends Fruit{}
class RedApple extends Apple{}

class Orange extends Fruit{}



