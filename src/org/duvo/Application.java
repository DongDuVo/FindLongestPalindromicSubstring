package org.duvo;

public class Application {

	public static void main(String[] args) {
		String s = "abcdcbadababacb";
		String result = findLongestPalindromicSubstring(s);
		System.out.println(result);
	}
	
	private static String findLongestPalindromicSubstring(String s) {
		int max = 0;
		String result = null;
		for (int i = 0; i < s.length(); i++) {
			int k = i;
			int count = 0;
			for (int j = s.length() - 1; j >= k; j--) {
				if (s.charAt(k) != s.charAt(j)) {
					if (count == 0) continue;
					k = i;
					count = 0;
				} else {
					if (k != j) count += 2;
					else count++;
					k++;
				}
			}
			if (max < count) {
				max = count;
				result = s.substring(i, i + count);
			}
		}
		
		return result;
	}
}
