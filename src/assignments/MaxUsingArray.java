package assignments;

public class MaxUsingArray {
    public static void main(String[] args) {
        int[] salary={30, 50, 60, 90, 10, 100, 999};
        int max=salary[0]; //30
        for(int i=1;i< salary.length;i++){
            if (salary[i] > max) {  // 50>30 ->50, 60>50->60, 90>50->90, 10>90->No, 100>90->100, 999>100 ->999
                max=salary[i];  // 50,  60,  90,  100,  999
             }
         }
        System.out.println("Max number :" +max); //999

        //Calling of function
        System.out.println("Maximum number is :"+search_Max()); // 340
    }
    //searching max using function
    public static int search_Max() {
        int array[]={12,121,1,2,340};
        int maxNum = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > maxNum) {
                maxNum = number;
            }
        }
        return maxNum;
    }
}
/*
Max number :999
Maximum number is :340
 */