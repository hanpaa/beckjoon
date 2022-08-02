import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.*;

public class Beck2447 {



    public static void main(String[] args) {

        int inputNum;
        Scanner sc = new Scanner(System.in);


        inputNum = sc.nextInt();

        char[][] starArray = new char[inputNum][inputNum];
        setArray(starArray, inputNum);

        makeSquare(inputNum, starArray,0,0);

        try {
            printSquare(starArray, inputNum);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void makeSquare(int size, char[][]array, int startPointX, int startPointY){
        if (size == 1){
            array[startPointX][startPointY] = '*';
            return;
        }

        for(int i = 0; i < 3; i++){
            for(int j =0; j < 3; j++){
                if(!(i==1 && j==1)) {
                    makeSquare(size / 3, array, startPointX + (size / 3) * i, startPointY + (size / 3) * j);
                }
                }
        }



    }

    public static void printSquare(char[][] array, int inputSize) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int x =0; x < inputSize; x++){
                bw.write(array[x]);
                bw.write("\n");
            }
        bw.flush();
        bw.close();
    }

    public  static void setArray(char[][] array, int inputSize){
        for (int x =0; x < inputSize; x++){
            for (int y=0; y<inputSize; y++){
                array[x][y] = ' ';
            }
        }
    }


}
