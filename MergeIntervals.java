import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF INTERVALS: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];

        System.out.println("ENTER INTERVALS (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt(); // start
            intervals[i][1] = sc.nextInt(); // end
        }

        int[][] merged = merge(intervals);

        System.out.println("MERGED INTERVALS:");
        for (int[] interval : merged) {
            System.out.println(interval[0] + " " + interval[1]);
        }

        sc.close();
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedList = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedList.add(currentInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                currentInterval = interval;
                mergedList.add(currentInterval);
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
