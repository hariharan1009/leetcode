class Solution {

    private int solve(
        int[] start1,
        int[] duration1,
        int[] start2,
        int[] duration2
    ) {
        int finish1 = Integer.MAX_VALUE;

        for (int i = 0; i < start1.length; i++) {
            finish1 = Math.min(finish1, start1[i] + duration1[i]);
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < start2.length; i++) {
            answer = Math.min(answer,Math.max(finish1, start2[i]) + duration2[i]
            );
        }

        return answer;
    }

    public int earliestFinishTime(
        int[] landStartTime,
        int[] landDuration,
        int[] waterStartTime,
        int[] waterDuration
    ) {
        return Math.min(
            solve(
                landStartTime,
                landDuration,
                waterStartTime,
                waterDuration
            ),
            solve(
                waterStartTime,
                waterDuration,
                landStartTime,
                landDuration
            )
        );
    }
}