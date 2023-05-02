package com.lukai.test;

public class StringUtils {

	/**
     * 反转字符串
     */
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    
  
}
