package advancedTest;

import java.util.Scanner;

public class Anagram_pair {

    public static boolean isAnagramPair(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int i, flag, c1 = 0, c2 = 0, j;
        for (i = 0; i < s1.length(); i++) {
            flag = 0;
            for (int m = 0; m < s1.length(); m++) {
                if (s1.charAt(i) == s1.charAt(m))
                    c1++;
            }
            for (j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    for (int l = 0; l < s2.length(); l++) {
                        if (s2.charAt(j) == s2.charAt(l))
                            c2++;
                    }
                    if (c1 == c2) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0)
                return false;
        }
        return true;
    }
    /*
	import java.util.*; 
	import java.io.*; 
	public class Main { 
	public static void main(String[] args) { 
	Scanner scn = new Scanner(System.in); 
	String str1 = scn.next(); 
	String str2 = scn.next(); 
	int[] frequencymap = new int[26]; 
	for(int i = 0; i < str1.length(); i++) { 
	frequencymap[str1.charAt(i)-'a']++; 
	} 
	for(int i = 0; i < str2.length(); i++) { 
	if(frequencymap[str2.charAt(i)-'a'] > 0) { 
	frequencymap[str2.charAt(i)-'a']--; 
	} else { 
	System.out.println("False"); return; 
	} 
	} 
	if(allzero(frequencymap)) { 
	System.out.println("True"); 
	}else { 
	System.out.println("False"); 
	} 
	scn.close(); 
	} 
	private static boolean allzero(int[] frequencymap) { 
	for(int i=0; i<26; i++) { 
	if(frequencymap[i]!=0) { 
	return false; 
	} 
	} 
	return true; 
	} 
	}
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        if (isAnagramPair(s1, s2)) {
            System.out.println("True");
        } else
            System.out.println("False");
    }

}
