package may23_NestedAnonymousClass;

public class AnonymousClass {
    public static void main(String[] args) {
        //As we can't create objects for abstract classes ,also interface(indirectly contains abstract class)
        // so we use anonymous class in place of object creation i.e it overrides methods from abstract class or interface
            ABC a=new ABC() {
                @Override
                void m1() {

                }
            };
            a.m1();

            I1 i=new I1() {
                @Override
                public void m2() {

                }
            };
            i.m2();

            A a1=new A() {
                @Override
                void display() {

                }
            };
            a1.display();

            I i1=new I() {
                @Override
                public void m() {

                }
            };
            i1.m();
        }
    }

    abstract class ABC{
        abstract void m1();
    }

    abstract class A{   // abstract class has methods that defines in other main class
           abstract void display();
    }

    interface I1{
        void m2();
    }

    interface I{
        void m();
    }


