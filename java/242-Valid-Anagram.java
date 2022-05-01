class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        s = String.valueOf(charArray);
        
        charArray = t.toCharArray();
        Arrays.sort(charArray);
        t = String.valueOf(charArray);
        
        if(t.equals(s)) 
            return true;
        else 
            return false;
    }
}
