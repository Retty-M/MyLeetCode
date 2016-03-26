package com.suiyue;

import java.util.Arrays;

public class ContainsDuplicate {
	//Ҳ�������ü��ϵ����������
	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i=1; i<nums.length; i++) {
			if(nums[i] == nums[i-1]) {
				return true;
			}
		}
		return false;
    }
	
	public boolean containsDuplicateBetter(int[] nums) {
	    byte[] mark = new byte[150000];
	    for (int i : nums) {
	        int j = i/8;
	        int k = i%8;
	        int check = 1<<k;
	        if ((mark[j] & check) != 0) {
	            return true;
	        }
	        mark[j]|=check;
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		
	}
}
