package corejava;

import java.util.*;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
    /** 158. Valid Anagram
     * @param s: The first string
     * @param t: The second string
     * @return: true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        int storageS[] = new int[256];
        int storageT[] = new int[256];
        int i = 0;
        for (i = 0 ; i < 256; i++){
            storageS[i] = storageT[i] = 0;
        }
        
        for (i = 0 ; i < s.length(); i++){
            storageS[(int)s.charAt(i)]++;
            storageT[(int)t.charAt(i)]++;
        }
        for (i = 0 ; i < 256; i++){
            if (storageS[i] != storageT[i]){
                return false;
            } 
        }
        return true;
    }
    

    /** 55. Compare Strings
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if (A.equals("") && !B.equals("")) return false;
        if (!A.equals("") && B.equals("")) return true;
        int[] sA = new int[256];
        int[] sB = new int[256];
        int i = 0;
        for (i=0;i<256;i++){
            sA[i] = sB[i] = 0;
        }
        for (i=0;i<A.length();i++){
            sA[(int)A.charAt(i)] ++ ;
        }
        for (i=0;i<B.length();i++){
            sB[(int)B.charAt(i)] ++ ;
        }
        for (i=0;i<256;i++){
            if (sA[i] < sB[i]){
                return false;
            }
        }
        return true;
    }
    

    /** 13. Implement strStr()
     * @param source: 
     * @param target: 
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        if(source == null || target == null){
            return -1;
        }
        if(target.length() ==0){
            return 0;
        }
        char[] s = source.toCharArray();
        char[] t = target.toCharArray();
        for(int i=0; i < s.length - t.length + 1;i++){
            boolean isExist = true;

            for(int j=0; j < t.length ; j++){
                if(s[i+j] != t[j]){
                    isExist = false;
                    break;
                }
            }
            if(isExist){
                return i;
            }
        }
        return -1;
        
        
    }

    /** 171. Anagrams
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> res = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < strs.length; i++){
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String str = String.valueOf(tmp);
            if(!map.containsKey(str)){
                map.put(str, 1);
            }else{
                map.put(str, map.get(str) + 1);
            }
        }
        
        for(int i = 0; i < strs.length; i++){
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String str = String.valueOf(tmp);
            if(map.get(str) > 1){
                res.add(strs[i]);
            }
        }
        
        return res;
    }


    /** 79. Longest Common Substring
     * @param A: A string
     * @param B: A string
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        int n = A.length();
       int m = B.length();
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int current = 0;
                while (i + current < n && j + current < m && A.charAt(i + current) == B.charAt(j + current))
                current++;
            max = Math.max(max, current);
        }
    }
    return max;
    }

    /** 78. Longest Common Prefix
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            int j = 0;
            while( j < strs[i].length() && j < prefix.length() && strs[i].charAt(j) == prefix.charAt(j)) {
                j++;
            }
            if( j == 0) {
                return "";
        }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }

}
