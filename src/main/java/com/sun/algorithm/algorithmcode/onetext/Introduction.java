package com.sun.algorithm.algorithmcode.onetext;

import java.util.Arrays;

/**
 * @author sunkai
 * @since 2021/10/22 3:39 下午
 */
public class Introduction {
    public static void main(String[] args) {
        int []arr = {2,4,6,23,54,32,46};
        System.out.println(getRepeat(arr));
    }

    /**
     * 判断数组中是否有重复元素
     * @param arr
     * @return
     */
    public static Boolean getRepeat(int [] arr){
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length - 1 ; i++){
            if (arr[i] == arr[i+1]){
                return false;
            }
        }
        return true;
    }

}
