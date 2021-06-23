package myfirstapp;

public class MinMax {
    public static void main(String args[]){
        int[] arr=new int[10];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

        //Maximum value in an array.
        int[] arr1=new int[10];
         int maxv=Integer.MIN_VALUE;
         for(int j=0;j<arr1.length;j++){
             if(arr1[j]>maxv){
                 maxv=arr[j];
             }
         }
         System.out.println(maxv);
    }
}
