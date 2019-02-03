package dynamic_programming;

import java.util.Scanner;

public class Min_Sum_Path {

    public static int minCostPath(int input[][],int i,int j) {
     if(i >= input.length || j >= input[0].length){
         return Integer.MAX_VALUE;
     }
     if((i == input.length - 1) && (j == input[0].length - 1)){
         return input[i][j];
     }
     int ans1 = minCostPath(input,i+1,j);
     int ans2 = minCostPath(input,i,j + 1);
     int ans3 = minCostPath(input,i + 1,j + 1);
     return input[i][j] + Math.min(ans1,Math.min(ans2,ans3));
    }

    public static int minCostPath(int input[][],int storage[][],int i,int j){
//        if(i >= input.length || j >= input[0].length){
//            return Integer.MAX_VALUE;
//        }
//        if((i == input.length - 1) && (j == input[0].length - 1)){
//            storage[i][j] = input[i][j];
//            return storage[i][j];
//        }
//        if(storage[i][j] != Integer.MAX_VALUE){
//            return storage[i][j];
//        }
//        else {
//            int ans1;
//            if (storage[i + 1][j] != Integer.MAX_VALUE) {
//                return storage[i + 1][j];
//            } else {
//                ans1 = minCostPath(input,storage,i + 1, j);
//                storage[i + 1][j] = ans1;
//            }
//
//            int ans2;
//            if (storage[i + 1][j + 1] != Integer.MAX_VALUE) {
//                return storage[i + 1][j + 1];
//            } else {
//                ans2 = minCostPath(input,storage,i + 1, j + 1);
//                storage[i + 1][j + 1] = ans2;
//            }
//
//            int ans3;
//            if (storage[i][j + 1] != Integer.MAX_VALUE) {
//                return storage[i][j + 1];
//            } else {
//                ans3 = minCostPath(input,storage,i, j + 1);
//                storage[i][j + 1] = ans3;
//            }
//            storage[i][j] = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
//            return storage[i][j];
//        }
        if((i == input.length - 1) && (j == input[0].length - 1)){
            storage[i][j] = input[i][j];
           return storage[i][j];
        }
        if(i >= input.length || j >= input[0].length){
            return Integer.MAX_VALUE;
        }
        if(storage[i][j] != 0){
            return storage[i][j];
        }else{

            int ans1;
            if(i+1 >= input.length || j >= input[0].length){
                ans1 =  Integer.MAX_VALUE;
            }else {
                if (storage[i + 1][j] != 0) {
                    ans1 =  storage[i + 1][j];
                } else {
                    ans1 = minCostPath(input, storage, i + 1, j);
                    storage[i + 1][j] = ans1;
                }
            }
            int ans2;
            if(i+1 >= input.length || j+1 >= input[0].length){
                ans2 =  Integer.MAX_VALUE;
            }else {
                if (storage[i + 1][j + 1] != 0) {
                    ans2 = storage[i + 1][j + 1];
                } else {
                    ans2 = minCostPath(input, storage, i + 1, j + 1);
                    storage[i + 1][j + 1] = ans2;
                }
            }
            int ans3;
            if(i >= input.length || j+1 >= input[0].length){
                ans3 = Integer.MAX_VALUE;
            }else {
                if (storage[i][j + 1] != 0) {
                    ans3 = storage[i][j + 1];
                } else {
                    ans3 = minCostPath(input, storage, i, j + 1);
                    storage[i][j + 1] = ans3;
                }
            }
            storage[i][j] = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
            return storage[i][j];
        }
    }

    public static int[][] takeInput(){
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0;i < rows;i++) {
            for(int j= 0;j < cols;j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] input = takeInput();
        int[][] storage = new int[input.length][input[0].length];
//        for(int i = 0;i < storage.length;i++){
//            for(int j = 0;j < storage[0].length;j++) {
//                storage[i][j] = Integer.MAX_VALUE;
//            }
//        }
        System.out.print("here" + minCostPath(input,storage,0,0));
        for(int i = 0;i < storage.length;i++){
            for(int j = 0;j < storage[0].length;j++){
                System.out.print(storage[i][j] + " ");
            }
            System.out.println();
        }
    }
}
