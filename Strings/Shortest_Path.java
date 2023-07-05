package Strings;
import java.util.*;
public class Shortest_Path {

    public static float sortest_path(String str){
        int x=0;
        int y=0;
        for (int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir=='S'){
                y--;
            } else if (dir=='N') {
                y++;
            } else if (dir=='W') {
                x--;
            }
            else {
                x++;
            }
        }
        int x2= x*x;
        int y2= y*y;
        return (float) Math.sqrt( x2 + y2);
    }

    public static void main(String[] args) {

        String re="WNEENESENNN";
        System.out.println(sortest_path(re));

    }
}
