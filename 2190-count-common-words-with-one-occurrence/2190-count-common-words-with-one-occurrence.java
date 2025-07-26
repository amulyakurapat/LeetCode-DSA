class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(String w : words1) map1.put(w,map1.getOrDefault(w,0) + 1);
        for(String w : words2) map2.put(w,map2.getOrDefault(w,0) + 1);
        int c = 0;
        for(String wo : map1.keySet()) {
            if(map1.get(wo) == 1 && map2.getOrDefault(wo,0) == 1) {
                c ++;
            }
        }
        return c;
    }
}