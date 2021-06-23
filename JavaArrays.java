package myfirstapp;

public class JavaArrays {
    public static void main(String args[]){

        //Instantiating an Array
        int[] arr=new int[10];

        //Array lENGTH
        int len=arr.length;
        System.out.println(len);

        //Iterating Arrays
        for(int i=0;i<len;i++){
            arr[i]=i;
        }
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }


    }
}
