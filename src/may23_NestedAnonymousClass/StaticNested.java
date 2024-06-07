package may23_NestedAnonymousClass;

public class StaticNested {
    public static void main(String[] args) {
        Outer_Class oc=new Outer_Class();    // This syntax doesn't work for static class
        /*Outer_Class.StaticInnerClass os=oc.new StaticInnerClass();
        Outer_Class.inner_Class oi=oc.new inner_Class();
         */

        //OuterClassName.StaticClassName ref=new OuterClassName.StaticClassName();
        //use below for static class to access
        Outer_Class.StaticInnerClass osc=new Outer_Class.StaticInnerClass();
        Outer_Class.StaticInnerClass.inner_Class osi=new Outer_Class.StaticInnerClass.inner_Class();
        //Outer_Class.StaticInnerClass.inner_Class.mostInnerClass osim=oc.new mostInnerClass();
        osc.show();


        }
    }
 class Outer_Class{
        static int o = 10;
        int oa = 20;


        static class StaticInnerClass{
            void show(){
                System.out.println(o);
                //System.out.println(oa);  can't access nonstatic variable in static method
            }

            static class inner_Class{
                void display(){
                    System.out.println(o);
                }

                    class mostInnerClass{
                        static int x=5;
                        int y=3;
                        void access(){
                            System.out.println(x + " " + y);
                        }

                    }  //end of mostInnerClass

            }// end of inner_Class

        }  //end of StaticInnerClass

 }//end of Outer_Class


