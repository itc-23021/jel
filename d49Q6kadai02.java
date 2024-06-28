// 23021
//中央値を求めるプログラム
import java.util.Arrays;

public class d49Q6kadai02 {
    public static void main(String[] arguments) {
        int[] nums = new int[arguments.length];

        int i = 0;
        for (String arg : arguments) {
            nums[i++] = Integer.parseInt(arg);
        }

        Analyzer analyzer = new Analyzer();
        analyzer.setNums(nums);
        System.out.println(analyzer.analyze());
    }
}

class Analyzer {
    int[] nums;

    void setNums(int[] nums) {
        this.nums = nums;
    }

    String analyze() {
        StringBuilder sb = new StringBuilder();

        double avg = getAverage();
        sb.append("平均値: ").append(avg).append("\n");

        int r = getRange();
        sb.append("値の範囲: ").append(r).append("\n");

        int[] counts = getHighLowCounts(avg);
        sb.append("平均より大きい値の個数: ").append(counts[0]).append(" 平均より小さい値の個数: ").append(counts[1]).append("\n");

        int median = getMedian();
        sb.append("中央値: ").append(median).append("\n");

        return sb.toString();
    }

    double getAverage() {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    int getRange() {
        int min = Arrays.stream(nums).min().orElse(Integer.MIN_VALUE);
        int max = Arrays.stream(nums).max().orElse(Integer.MAX_VALUE);
        return max - min;
    }

    int[] getHighLowCounts(double average) {
        int countAbove = 0;
        int countBelow = 0;
        for (int num : nums) {
            if (num > average) {
                countAbove++;
            } else if (num < average) {
                countBelow++;
            }
        }
        return new int[]{countAbove, countBelow};
    }

    int getMedian() {
        Arrays.sort(nums);
        int middleIndex = nums.length / 2;
        return nums[middleIndex];
    }
}

