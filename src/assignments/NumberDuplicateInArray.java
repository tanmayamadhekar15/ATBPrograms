package assignments;

public class NumberDuplicateInArray {
    public static void main(String[] args) {
        int num_array[]={ 100, 20, 30, 20, 20 ,20, 200 ,20};
        int duplicate=20;
        int count=0;

        for(int element : num_array){
            if(element == duplicate){
                count++;
            }
        }
        System.out.println(count);  // 5
    }
}
