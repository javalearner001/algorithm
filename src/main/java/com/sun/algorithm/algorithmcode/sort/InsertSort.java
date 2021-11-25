package com.sun.algorithm.algorithmcode.sort;

import com.alibaba.fastjson.JSON;

/**
 * @author sunkai
 * @since 2021/10/12 3:52 下午
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {1,11,2,4,3,33,22,13,25,5,6};
        insertTest(arr,1);
        System.out.println(JSON.toJSONString(arr));
    }

    public static void test1(int[] arr, int value){
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < i ; j++){
                if (arr[i] < arr[j]){

                }
            }
        }
    }

    public static void insertTest(int[] arr, int value){

        for (int i = 0 ; i < arr.length - 1 ; i++){
            //单趟插入
            int end = i;
            int temp = arr[end + 1];

            while (end >= 0){
                if (arr[end] > temp){
                    arr[end + 1] = arr[end];
                    end--;
                }else {
                    break;
                }
            }
            //两种情况  第一种在最右边   第二种在最左边  ，  end为-1了，始终放在end后面
            arr[end + 1] = temp;
        }
    }
}
