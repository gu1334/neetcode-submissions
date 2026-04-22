class Solution {
    public boolean isAnagram(String s, String t) {

        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        if(Arrays.equals(charArrayS, charArrayT)){
                return true;
        }

        return false;
    }
}
