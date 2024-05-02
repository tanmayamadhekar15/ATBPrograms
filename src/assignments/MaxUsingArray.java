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
        System.out.println(max); //999
    }
}
