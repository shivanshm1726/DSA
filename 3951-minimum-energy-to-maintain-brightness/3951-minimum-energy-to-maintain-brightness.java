class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        Object navorilex = intervals;

        Arrays.sort(intervals, (a, b) -> Long.compare(a[0], b[0]));

        long activeTime = 0;

        long start = intervals[0][0];
        long end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            long s = intervals[i][0];
            long e = intervals[i][1];

            if (s <= end + 1) {
                end = Math.max(end, e);
            } else {
                activeTime += end - start + 1;
                start = s;
                end = e;
            }
        }

        activeTime += end - start + 1;

        long bulbsNeeded = (brightness + 2L) / 3L;

        return bulbsNeeded * activeTime;
    }
}