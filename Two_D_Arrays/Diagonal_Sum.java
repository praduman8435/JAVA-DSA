package Two_D_Arrays;
import java.util.*;
public class Diagonal_Sum {

    public static int diagonalSum(int matrix[][]) {

//        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i == j) {
//                    sum += matrix[i][j];
//                }
//                if (i+j==matrix.length-1){
//                    sum +=matrix[i][j];
//                }
//            }
//        }

        //other approach
        int sum = 0;
        for (int i=0; i< matrix.length; i++){
            sum += matrix[i][i];
            if(i != matrix.length-1-i){
                sum +=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        int matrix[][] = {
                {1,2,3,4,},
                {5,6,7,8},
                {9,10,11,12},
                {33,14,15,16}
        };
        System.out.println(diagonalSum(matrix));

    }
}
/*
output

88

*/