package may02_array;

public class Ex76 {
    public static void main(String[] args) {
        //define  - {} , new
        int[] a={1,2,3,4};
        int b[]={4,5,6,7};
        System.out.println(a.length);  // 4

        //how to display elements in array using for loop
        for (int i=0 ; i<a.length ; i++){   // index in arrays always starts with 0
            System.out.println(a[i]); //prints -  1, 2, 3, 4
        }

        for (int i1=1 ; i1<b.length ; i1++){   // index in arrays always starts with 0
            System.out.println(b[i1]); //prints -   5, 6, 7 - skips 0th element
        }

        for (int i1=1 ; i1 <= b.length ; i1++){   // index in arrays always starts with 0, if condition changes to <= instead <
            System.out.println(b[i1]); //prints -   5, 6, 7 - skips 0th element and throws array out of bound exception
        }

        for (int i1=1 ; i1<b.length - 1 ; i1++){   // index in arrays always starts with 0
            System.out.println(b[i1]); //prints -   5, 6 - skips 0th,last element, array out of bound
        }

    }
}
