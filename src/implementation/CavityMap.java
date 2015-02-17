package implementation;

import java.util.Scanner;

/**
 * given a square n×n map. Each cell of the map has a value in it denoting the depth of the appropriate area.
 * We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each
 * cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side.
 * You need to find all the cavities on the map and depict them with character uppercase X.
 *
 *
 * Created by Varun on 17-02-2015.
 */
public class CavityMap {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int dim = in.nextInt();
        in.nextLine();
        char[][] arr = new char[dim][dim];
        for(int i = 0; i < dim ; i++){
            String s = in.nextLine();
            for(int j = 0; j< dim ; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        for(int i = 1; i < dim-1 ; i++){
            for(int j = 1; j < dim-1 ; j++){
                arr[i][j] = setX(arr,i,j);
            }
        }
        for(int i = 0; i < dim; i++){
            for(int j = 0; j < dim ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static char setX(char[][] arr, int i, int j){
        char c = arr[i][j];
        if(arr[i-1][j] >= c)
            return c;
        if(arr[i][j-1] >= c)
            return c;
        if(arr[i+1][j] >= c)
            return c;
        if(arr[i][j+1] >= c)
            return c;
        return 'X';
    }
}
