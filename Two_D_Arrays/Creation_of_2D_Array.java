package Two_D_Arrays;
import java.util.*;
public class Creation_of_2D_Array {
    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        int m = matrix.length, n = matrix[0].length;
        //total no. of cell == rows x column
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the"+ "("+ i +")"+ "("+ j +")" + "element");
                matrix[i][j] = sc.nextInt();
            }
        }

        //print
        System.out.println("Matrix is ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
/*
output

Enter the(0)(0)element
1
Enter the(0)(1)element
2
Enter the(0)(2)element
3
Enter the(1)(0)element
4
Enter the(1)(1)element
5
Enter the(1)(2)element
6
Enter the(2)(0)element
7
Enter the(2)(1)element
8
Enter the(2)(2)element
9
Matrix is
1 2 3
4 5 6
7 8 9

*/