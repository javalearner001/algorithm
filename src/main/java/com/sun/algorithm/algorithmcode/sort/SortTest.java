package com.sun.algorithm.algorithmcode.sort;

import com.alibaba.fastjson.JSON;

/**
 * @author sunkai
 * @since 2021/10/21 10:58 上午
 */
public class SortTest {
    public static void main(String[] args) {
        int []arr = {22,1,3,46,33,42,4,6,8,83,2};
        insertSort(arr);
        System.out.println(JSON.toJSONString(arr));

    }

    private static void insertSort(int []arr){
        for (int i = 0 ; i < arr.length - 1 ; i++){
            int m = i;
            int temp = arr[m + 1];
            while (m >= 0){
                if (arr[m] > temp){
                    arr[m + 1] = arr[m];
                    m--;
                }else {
                    //之前的都是有序的，所以基数temp  arr[m] <= temp 时，认为他前面的都是小于他并且有序，找到了位置，跳出循环，插入位置
                    break;
                }

            }
            arr[m +1] = temp;
        }
    }
}
