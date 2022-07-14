package Assingmentjambav;

import java.util.Arrays;

public class StringAnagram {
	void ana() {
		String s1 = "listen";
		String s2 = "Silent";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() == s2.length()) {
			char[] ch = s1.toCharArray();
			char[] ch1 = s2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			boolean result = Arrays.equals(ch, ch1);
			if (result) {
				System.out.println(" It is anagram");
			} else {
				System.out.println(" it is not anagram");
			}
		} else {
			System.out.println(" It is not anagram");
		}
	}

	public static void main(String[] args) {
		StringAnagram sa = new StringAnagram();
		sa.ana();

	}

}
