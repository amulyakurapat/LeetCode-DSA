class Solution {
    public boolean isAnagram(String s, String t) {
        char[] st = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(ts);
        return Arrays.equals(st,ts);
            }
}