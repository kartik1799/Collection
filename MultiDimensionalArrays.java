package myfirstapp;

public class MultiDimensionalArrays {
    public static void main(String args[]){
        int[][] arr=new int[10][20];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("i: "+i+" ,j: "+j);
            }
        }
    }
}
