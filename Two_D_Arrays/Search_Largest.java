package Two_D_Arrays;

public class Search_Largest {

    public static void search_largest(int matrix[][]){
        int largest =Integer.MIN_VALUE;
        for (int i=0;i< matrix.length; i++){
            for (int j=0;j<matrix[0].length; j++){
                int number = matrix[i][j];
                if (number >largest){
                    largest=number;
                }
            }
        }
        System.out.println("largest no. is "+largest);
    }

    public static void main(String[] args) {

        int matrix[][] ={
                {1,2,3,4,},
                {5,6,7,8},
                {9,10,11,12},
                {33,14,15,16}
        };

        search_largest(matrix);

    }
}
/*
output

largest no. is 33

*/