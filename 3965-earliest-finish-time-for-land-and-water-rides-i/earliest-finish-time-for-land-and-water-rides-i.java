class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        return Math.min(
            solve(landStartTime, landDuration,
                  waterStartTime, waterDuration),

            solve(waterStartTime, waterDuration,
                  landStartTime, landDuration)
        );
    }

    private int solve(int[] firstStart, int[] firstDur,
                      int[] secondStart, int[] secondDur) {

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < firstStart.length; i++) {
            int firstFinish = firstStart[i] + firstDur[i];

            for (int j = 0; j < secondStart.length; j++) {
                int secondBegin = Math.max(firstFinish, secondStart[j]);
                int totalFinish = secondBegin + secondDur[j];

                ans = Math.min(ans, totalFinish);
            }
        }

        return ans;
    }
}