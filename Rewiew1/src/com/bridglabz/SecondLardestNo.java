package com.bridglabz;

public class SecondLardestNo {
    public static void main(String[] args) {
        int array[]= {2,6,7,8,9,3,4,5};
        int temp;
        int size=array.length;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(array[size-2]);
    }
}
