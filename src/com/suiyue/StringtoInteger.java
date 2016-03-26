package com.suiyue;

public class StringtoInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("result = " + myAtoi("        1"));

	}
	
	/*
	 * 1�������ϸ�ʽ�����0
	 * 2���ַ�����β�Ŀո����
	 * 3�������������ֵ
	 * 4����ͷ��һ���ַ�����������ʽ��ֻ�����ͷ��һ����
	 * 5������
	 */
	public static int myAtoi(String str) {
		str = str.trim();
		boolean isNegative = false;
		int result = 0;
		if (str.length() == 0) {
			return 0;
		} else if (str.charAt(0) == '-') {
			isNegative = true;
			if (str.length() == 1) {
				return 0;
			}
			str = str.substring(1);
			System.out.println(str);
		} else if(str.charAt(0) == '+') {
			if (str.length() == 1) {
				return 0;
			}
			str = str.substring(1);
		}
		int i = 0;
		while (i<str.length() && str.charAt(i)>47 && str.charAt(i)<58) {
			if (isNegative) {
				result = result * 10 - (str.charAt(i) - '0');
			} else {
				result = result * 10 + (str.charAt(i) - '0');
			}
			if (result == 0) {
				i++;
				continue;
			}
			if (isNegative) {
				if(result + (str.charAt(i) - '0') != result/10 * 10) {
					return isNegative?-2147483648:2147483647;
				}
			} else {
				if(result - (str.charAt(i) - '0') != result/10 * 10) {
					return isNegative?-2147483648:2147483647;
				}
			}
			
			i++;	
		}
		
		return result;
        
    }

}
