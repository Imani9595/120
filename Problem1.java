public class Problem1 {
    public static long calcTotal(long[][] arr) {
        long arrayTotal = 0;
        for (long[] innerArr : arr) {
            for (long val : innerArr) {
                arrayTotal = arrayTotal + val;
            }
        }
        return arrayTotal;
    }


    public static double calcAverage(long[][] arr) {
        long arrayTotal = calcTotal(arr);
        int length = 0;
        for (long[] innerArr : arr) {
            length += innerArr.length;
        }
        return (double) arrayTotal / length;
    }


    public static double calcRowAverage(long[][] nums, int rowNumber) {

        long rowTotal = 0;
        for (long val : nums[rowNumber]) {
            rowTotal += val;
        }

        int length = nums[rowNumber].length;
        return (double) rowTotal / length;
    }

    public static void main(String[] args) {
        long[][] nums = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {10, 11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        System.out.println("Array total: " + calcTotal(nums));
        System.out.println("Array average: " + calcAverage(nums));
        for (int row = 0; row < nums.length; row++)
            System.out.println("Row " + row + " Average: " + calcRowAverage(nums, row));
    }
}
