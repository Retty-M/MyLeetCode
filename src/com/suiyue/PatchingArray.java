package com.suiyue;

public class PatchingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * tmp�ǿ��ܴ������Сֵ��Ҳ����Ŀǰ�������[0,tmp)�Ĺ���
	 * ��������д���һ������num<=tmp�����ǾͿ������[0��tmp+num)�Ĺ���
	 * �������������һ�����֣����Ǿ���Ҫ����һ������������
	 */
	public int minPatches(int[] nums, int n) {
		long tmp = 1;
		int result = 0;
		int i = 0;
		while(tmp<n) {
			if(i<nums.length && nums[i] <= tmp) {
				tmp += nums[i++];
			} else {
				tmp += tmp;
				result ++;
			}
		}
		return result;
        
    }

}
