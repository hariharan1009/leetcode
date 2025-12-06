class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();      
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }        
        PriorityQueue<Map.Entry<Character, Integer>> pq = 
            new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        
        pq.addAll(map.entrySet());
        
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char c = entry.getKey();
            int count = entry.getValue();
            sb.append(String.valueOf(c).repeat(count));

        }
        return sb.toString();
    }
}