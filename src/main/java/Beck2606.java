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
        int[] memo = new int[101];
        int[][] graph = new int[101][101];
        for(int i = 0; i <= 100; i++){
            memo[i] =0;
        }
        for(int i = 0; i <= 100; i++){
            for(int j = 0; i <= 100; i++){
                graph[i][j] =0;
            }
        }
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        String str;
        String[] tokenList;
        int node = Integer.parseInt(br.readLine());


        while((str = br.readLine()) != null){

            tokenList = str.split(" ");
            int num1 = Integer.parseInt(tokenList[0]);
            //                ArrayList<Integer> newAL = new ArrayList<Integer>();
            //                newAL.add(num);
            //                array.add(num, newAL);
                int num2 = Integer.parseInt(tokenList[1]);
//                if(array.get(num1) != null){
//                    array.get(num1).add(num2);
//                }else{
//                    ArrayList<Integer> newAL = new ArrayList<Integer>();
//                    newAL.add(num2);
//                    array.add(num1,newAL);
//                }
                graph[num1][num2] = 1;
                graph[num2][num1] = 1;

        }

        dfs(1, memo, array);

        br.close();

    }

    public static void dfs(int startPoint,int[] memo, ArrayList<ArrayList<Integer>> array){

        memo[startPoint] =1;

        for(int i =0; i<array.get(startPoint).size(); i++){
            if(array.get(startPoint)!= null & memo[startPoint] == 0)
                dfs(array.get(startPoint).get(i), memo, array);
        }


    }
}
