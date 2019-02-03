//TODO
//package dynamic_programming;
//import java.util.Scanner;
//public class LongestCommonSubSequence {
//
//    public static int lcs(String s1, String s2){
//      if(s1.length() == 0 || s2.length() == 0){
//          return 0;
//      }
//       if(s1.charAt(0) == s2.charAt(0)){
//           return 1 + lcs(s1.substring(1),s2.substring(1));
//       }else{
//           int ans1 = lcs(s1,s2.substring(1));
//           int ans2 = lcs(s1.substring(1),s2);
//           return Math.max(ans1,ans2);
//       }
//    }
//
//    public static int lcs(String s1, String s2,int[][] storage){
//
//    }
//
//    public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
//    String s1 = s.next();
//    String s2 = s.next();
//    int[][] storage = new int[s1.length() + 1][s2.length() + 1];
//    System.out.print(lcs(s1,s2));
//    System.out.print(lcs(s1,s2,storage));
//    }
//}
