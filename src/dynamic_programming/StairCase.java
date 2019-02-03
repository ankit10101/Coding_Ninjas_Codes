package dynamic_programming;

import java.util.Scanner;

public class StairCase {

    public static long staircase(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
    }

    public static long staircaseMemorisation(int n, long[] storage) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            storage[1] = 1;
            return 1;
        }
        if (n == 2) {
            storage[2] = 2;
            return 2;
        }
        if (n == 3) {
            storage[3] = 4;
            return 4;
        }
        if (storage[n] == 0) {
            long ans1;
            if (storage[n - 1] == 0) {
                ans1 = staircaseMemorisation(n - 1, storage);
                storage[n - 1] = ans1;
            } else {
                ans1 = storage[n - 1];
            }

            long ans2;
            if (storage[n - 2] == 0) {
                ans2 = staircaseMemorisation(n - 2, storage);
                storage[n - 2] = ans2;
            } else {
                ans2 = storage[n - 2];
            }

            long ans3;
            if (storage[n - 3] == 0) {
                ans3 = staircaseMemorisation(n - 3, storage);
                storage[n - 3] = ans3;
            } else {
                ans3 = storage[n - 3];
            }

            storage[n] = ans1 + ans2 + ans3;
        }
        return storage[n];
    }

    public static long staircaseIterative(int n) {
        long[] storage = new long[n + 1];
        if (n == 0)
            return storage[0];
        storage[1] = 1;
        if (n == 1)
            return storage[1];
        storage[2] = 2;
        if (n == 2)
            return storage[2];
        storage[3] = 4;
        if (n == 3)
            return storage[3];
        for (int i = 4; i <= n; i++) {
            storage[i] = storage[i - 1] + storage[i - 2] + storage[i - 3];
        }
        return storage[n];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] storage = new long[n + 1];
        System.out.println(staircase(n));
        System.out.println(staircaseMemorisation(n, storage));
        System.out.println(staircaseIterative(n));

    }
}
