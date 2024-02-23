package com.test.demo;

import org.junit.jupiter.api.Test;

public class AppTest {

  /**
     * test sort
     */
    
    @Test
    public void testSort() {

        int[] arr = {5,3,7,2,4,6,8,1};
        //selectSort(arr);
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("");

    }
    

    public  void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    /**
     *  select sort
     * @param arr
     */
    public void selectSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // min number
            int min = i;
            // Put the smaller numbers first
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //
            swap(arr, min, i);
        }

    }

    /**
     * bubble Sort
     * @param arr
     */
    public void bubbleSort(int arr[]){
        //length-1 The sequence of the last digit is known and does not require traversal, -1
       for(int i = 0; i<arr.length-1; i++){
           //arr.length-1 -i Minus i represents that after each round of sorting, there are i elements that do not need to be sorted
           for(int j = 0; j<arr.length-1 -i; j++){
               if(arr[j] > arr[j+1]){
                   swap(arr,j,j+1);
               }
           }
       }

    }
  

}
