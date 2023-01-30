package HomeWork;

import java.util.Arrays;

class Probe2 {
    public static int missNumb(int[] arr) {

        int n = arr.length;

        int m = n + 1;

        int total = m * (m + 1) / 2;

        int sum = Arrays.stream(arr).sum();

        return total - sum;
    }
}


