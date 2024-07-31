// Sorting Algorithms - Greg Hogg DSA Course Materials Lecture 10

// Bubble Sort
public class Main {
    public static void main(String[] args) {
        int[] A = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
        bubbleSort(A);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(A));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    flag = true;
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

// Insertion Sort
public class Main {
    public static void main(String[] args) {
        int[] B = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
        insertionSort(B);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(B));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }
}

// Selection Sort
public class Main {
    public static void main(String[] args) {
        int[] C = {-3, 3, 2, 1, -5, -3, 7, 2, 2};
        selectionSort(C);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(C));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

// Merge Sort
public class Main {
    public static void main(String[] args) {
        int[] D = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
        int[] sortedArray = mergeSort(D);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(sortedArray));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int mid = arr.length / 2;
        int[] left = java.util.Arrays.copyOfRange(arr, 0, mid);
        int[] right = java.util.Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, l = 0, r = 0;
        while (l < left.length && r < right.length) {
            result[i++] = (left[l] < right[r]) ? left[l++] : right[r++];
        }
        while (l < left.length) result[i++] = left[l++];
        while (r < right.length) result[i++] = right[r++];
        return result;
    }
}

// Quick Sort
public class Main {
    public static void main(String[] args) {
        int[] E = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
        quickSort(E, 0, E.length - 1);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(E));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}


// Counting Sort
public class Main {
    public static void main(String[] args) {
        int[] F = {5, 3, 2, 1, 3, 3, 7, 2, 2};
        countingSort(F);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(F));
    }

    public static void countingSort(int[] arr) {
        int n = arr.length;
        int max = java.util.Arrays.stream(arr).max().getAsInt();
        int[] counts = new int[max + 1];
        for (int num : arr) {
            counts[num]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (counts[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }
}
