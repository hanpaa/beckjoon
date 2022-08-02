import sun.awt.image.ImageWatched;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Beck2606 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] memo = new int[100];
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        String str;
        String[] tokenList;
        while((str = br.readLine()) != null){

            tokenList = str.split(" ");
            if(tokenList.length == 2){
                int num1 = Integer.parseInt(tokenList[0]);
                int num2 = Integer.parseInt(tokenList[1]);
                if(array.get(num1) != null){
                    array.get(num1).add(num2);
                }else{
                    ArrayList<Integer> newAL = new ArrayList<Integer>();
                    newAL.add(num2);
                    array.add(num1,newAL);
                }
            }else{
                ArrayList<Integer> newAL = new ArrayList<Integer>();
                int num = Integer.parseInt(tokenList[0]);
                newAL.add(num);
                array.add(num, newAL);
            }
        }

        dfs(1, memo);

        br.close();

    }

    public static void dfs(int startPoint,int[] memo, ArrayList<ArrayList<Integer>> array){

        memo[startPoint] =1;

        


    }
}
