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
        int node = Integer.parseInt(br.readLine());
        int edgeNumber = Integer.parseInt(br.readLine());


        int[] memo = new int[node+1];
        int[][] graph = new int[node+1][node+1];
        for(int i = 0; i <= node; i++){
            memo[i] =0;
        }
        for(int i = 0; i <= node; i++){
            for(int j = 0; i <= node; i++){
                graph[i][j] =0;
            }
        }
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        String str = null;
        String[] tokenList;


        for(int i =0; i < edgeNumber; i++){
            str = br.readLine();
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

        int count = 0;
        count = dfs(1, memo, graph, node, count);
        System.out.println(count-1);

        br.close();

    }

    public static int dfs(int startPoint,int[] memo, int[][]graph,int node, int count){

        memo[startPoint] =1;
        count++;
        for(int i =0; i<=node; i++){
            if(graph[startPoint][i] == 1 && memo[i] == 0)
                count = dfs(i, memo, graph,node, count);
        }
        return count;
    }
}
