package may28_collectionFramework;

public class GenericsEx2 {
    // Generic is creating custom datatype class
    //It allows to reusability of code , where one single method can be used for different datatypes of variable or object
    // use diamond operator <variable>
    public static void main(String[] args) {
        // 12,1,40
        // s,a,t
        // 12.3, 30.5, 1.2
        int max=maxNum(12,1,40);
        System.out.println(max);
        double maxD=maxNumD(12.3,305,1.2);
        System.out.println(maxD);
        String maxS=maxNumS("s","a","t");
        System.out.println(maxS);

        //Reuse of code with diff datatypes one single method
        print(1);
        print("A");
        print('a');
        print(12.1);
        print(true);

        //generic calling
        System.out.println(maxOf(1,3,0));  //3
        System.out.println(maxOf(1.2,1.3,1.0));  // 1.3
        System.out.println(maxOf('z','f','w'));  // z
    }  // end of main
    private static <T> void print(T a){   // generic
        System.out.println(a);
    }

    private static <DT extends Comparable<DT>>DT maxOf(DT a,DT b,DT c){
        DT mx=a;
        if(b.compareTo(mx)>0){
            mx=b;
        }
        if(b.compareTo(mx)>0){
            mx=c;
        }
        return mx;
    }//end of generic
    private static int maxNum (int x,int y,int z){
        int max=x;
        if(y > max){
            max=y;
        }
        if (z > max ){
            max=z;
        }
        return max;
    }  //end of function
    private static double maxNumD(double x,double y,double z){
        double max=x;
        if(y > max){
            max=y;
        }
        if (z > max ){
            max=z;
        }
        return max;
    }  //end of function
    private static String maxNumS (String x,String y,String z){
        String max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if (z.compareTo(max) >0 ){
            max=z;
        }
        return max;
    }  //end of function
} //end of class
