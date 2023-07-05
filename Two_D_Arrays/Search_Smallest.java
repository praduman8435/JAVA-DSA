package Two_D_Arrays;

public class Search_Smallest {

    public static void search_smallest(int matrix[][]){
        int smallest =Integer.MAX_VALUE;
        for (int i=0;i< matrix.length; i++){
            for (int j=0;j<matrix[0].length; j++){
                int number = matrix[i][j];
                if (number <smallest){
                    smallest=number;
                }
            }
        }
        System.out.println("smallest no. is "+smallest);
    }

    public static void main(String[] args) {

        int matrix[][] ={
                {1,2,3,4,},
                {5,6,7,8},
                {9,10,11,12},
                {33,14,15,16}
        };

        search_smallest(matrix);

    }
}
/*
output

smallest no. is 1

*/