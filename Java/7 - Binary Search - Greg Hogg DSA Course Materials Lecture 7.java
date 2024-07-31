// Binary Search - Greg Hogg DSA Course Materials Lecture 7

public class Main {
    public static void main(String[] args) {
        int[] A = {-3, -1, 0, 1, 4, 7};
        int target = 8;
        boolean result = binarySearch(A, target);
        System.out.println("Is " + target + " in the array? " + result);
    }

    // Traditional Binary Search - O(log n) time, O(1) space
    public static boolean binarySearch(int[] arr, int target) {
        int L = 0;
        int R = arr.length - 1;

        while (L <= R) {
            int M = L + (R - L) / 2;
            if (arr[M] == target) {
                return true;
            } else if (target < arr[M]) {
                R = M - 1;
            } else {
                L = M + 1;
            }
        }
        return false;
    }
}


public class Main {
    public static void main(String[] args) {
        boolean[] B = {false, false, false, false, false, true, true};
        int result = binarySearchCondition(B);
        System.out.println("First true element index: " + result);
    }

    // Condition-based Binary Search - O(log n) time, O(1) space
    public static int binarySearchCondition(boolean[] arr) {
        int L = 0;
        int R = arr.length - 1;

        while (L < R) {
            int M = (L + R) / 2;
            if (arr[M]) {
                R = M;
            } else {
                L = M + 1;
            }
        }
        return L;
    }
}


