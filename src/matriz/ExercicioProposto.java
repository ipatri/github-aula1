package matriz;

import java.util.Scanner;

public class ExercicioProposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas = sc.nextInt();
        int colunas = sc.nextInt();
        int[][] mat = new int[linhas][colunas];
        for (int i = 0; i < linhas ; i++){
            for (int j =0;j<colunas;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("n#");
        int num = sc.nextInt();
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if (mat[i][j]==num){
                    System.out.println("Position "+mat[i]+","+mat[j]);
                    System.out.println("Left: "+mat[i-1][j]);
                    System.out.println("Right: "+mat[i+1][j]);
                    System.out.println("Dows: "+mat[i][j+1]);
                }
            }
        }
        sc.close();
    }
}
