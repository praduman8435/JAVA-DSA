package Recursion_Basics;

public class Tiling_Problem {

    public static int tile_problem(int n){
        if(n==0 ||n==1){
            return 1;
        }
        //vertical choice
        int vertical_size=tile_problem(n-1);

        //horizontal_choice
        int horizontal_size=tile_problem(n-2);

        return vertical_size+horizontal_size;
    }

    public static void main(String[] args) {

        System.out.println(tile_problem(4));

    }
}
/*
output

5

*/