class A{
    String test(){
        System.out.println("Base class");
        return null;
    }
}

class B extends A{
    String test = super.test();
    String test(){
        System.out.println("child class");
        return null;
    }
}


abstract class Shape{
    int abc;
    Shape(int a){
        abc = a;
    }
    public abstract void test();
    void display(){
        System.out.println("display");
    }
}

class S1 extends Shape {
    S1(int a) {
        super(a);
    }

    @Override
    public void test() {
        System.out.println("Shape S1");
    }
}
class S2 extends Shape {
    S2(int a) {
        super(a);
    }

    @Override
    public void test() {
        System.out.println("Shape S2");
    }
}


interface A1{
    double pi = 3.143;
    void display();

    default void test(){
        System.out.println("interface");
    }
}

class A2 implements A1{
    @Override
    public void test(){
        System.out.println("implemented class");
    }
    @Override
    public void display() {
        System.out.println("Hi");
    }
}

interface X{
    default void o(){
        System.out.println("Hello");
    }
}

interface  Y{
    default void o(){
        System.out.println("Test");
    }
}

class XYZ implements X,Y{

    @Override
    public void o() {
        X.super.o();
        Y.super.o();
    }
}

public class Main {
    public static void main(String[] args) {
        XYZ obj = new XYZ();
        obj.o();
//        A1 obj = new A1() {
//            @Override
//            public void display() {
//                System.out.println("Test");
//            }
//        };
//        A1 obj2 = new A2();
//        System.out.println(A1.pi);
//        obj.test();
//        obj2.test();
//        Shape a = new S2(15);
//        System.out.println(a.abc);
//        S2 obj = new S2(20);
//        Shape obj1 = new S1(10);
//        System.out.println(obj.abc);
//        System.out.println(obj1.abc);
    }
}