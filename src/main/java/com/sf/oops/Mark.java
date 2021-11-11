package com.sf.oops;

class Parent
{
    public void p1()
    {
        System.out.println("Parent method");
    }
}
class Child extends Parent {

    public void c1()
    {
        System.out.println("Child method");
    }
    public static void main(String[] args)
    {
        Child cobj = new Child();
        cobj.c1();
        cobj.p1();
    }
}
