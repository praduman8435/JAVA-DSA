package Graph;

import java.util.*;
public class FloodFill_Algorithm {
    public void helper(int[][] img, int sr, int sc, int color, boolean vis[][], int orgCol) {
        if (sr<0 || sc<0 || sr>=img.length || sc>= img.length || vis[sr][sc] || img[sr][sc] != orgCol){
            return ;
        }
        //left
        helper(img, sr, sc-1, color, vis, orgCol);

        //right
        helper(img, sr, sc+1, color, vis, orgCol);

        //up
        helper(img, sr-1, sc, color, vis, orgCol);

        //down
        helper(img, sr+1, sc, color, vis, orgCol);

    }
        public int[][] floodFill(int[][] img, int sr, int sc, int color){
        boolean vis[][] = new boolean[img.length][img[0].length];
        helper(img, sr, sc, color, vis, img[sr][sc]);
        return img;
    }

    public static void main(String[] args) {

    }
}
