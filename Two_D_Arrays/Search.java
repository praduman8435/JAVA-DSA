package Two_D_Arrays;

public class Search {

    public static boolean search(int matrix[][], int key){


        for (int i=0;i< matrix.length; i++){
            for (int j=0;j<matrix[0].length; j++){
                if (matrix[i][j] == key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] ={
                {1,2,3,4,},
                {5,6,7,8},
                {9,10,11,12},
                {33,14,15,16}
        };

        int key =14;
        search(matrix, 5);

    }
}
/*
output

found at cell (1,0)

*/