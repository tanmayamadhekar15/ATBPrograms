package may04_2d_arrays;

public class Ex86 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {34, 12, 11},
                {34, 12, 34}
        };

        int row = array_2d.length;
        for (int i = 0; i < row; i++) { // Row  0,1
            for (int j = 0; j < array_2d[i].length; j++) { // Column - 0,1,2
                System.out.printf("\t"+array_2d[i][j]);
            }
        }
    }
}
