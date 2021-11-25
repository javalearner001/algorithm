package com.sun.algorithm.algorithmcode.array;

/**
 * 滑动窗口解决最小连续自序和
 * 使用双指针方式解决问题
 *
 * @author sunkai
 * @since 2021/11/22 11:59 上午
 */
public class SlidingWindow {

    public static void main(String[] args) {
        int [] arr = {6,4,3,2,7,1,8,1,3,5,9,7,1,2};
        int value = 8;
        System.out.println(solution(arr,15));
    }

    public static int solution(int [] arr,int value){
        int left = 0,right;
        int result = Integer.MAX_VALUE;
        int sum = 0;

        for (right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= value){
                result = Math.min(result, right - left + 1);
                sum -= arr[left];
                left++;
            }

        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
