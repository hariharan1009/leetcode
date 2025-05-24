class Solution {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> set = new HashSet<>(2*nums.length);
        for (int i : nums) {
            if (!set.add(i))
                return true;
        }
        return false;
    }
}