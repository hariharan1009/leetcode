class Solution {
    public int maxChunksToSorted(int[] arr) {
        int sum = 0, permu = 0, c = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            permu += i;
            if (sum == permu) {
                c++;
            }
        }
        return c;
    }
}