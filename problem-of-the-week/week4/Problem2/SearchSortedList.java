// Problem 2: Search in a Sorted List Without Multiplication, Division, or Bit-Shifts
// Company: Netflix

public class SearchSortedList {

    // Custom integer division using subtraction
    private static int divideByTwo(int n) {
        int count = 0;
        while (n >= 2) {
            n -= 2;
            count++;
        }
        return count;
    }

    public static boolean binarySearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + divideByTwo(high - low);

            if (arr[mid] == x) return true;
            if (arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {-5, -2, 0, 3, 7, 10, 15};
        System.out.println(binarySearch(arr1, 7)); // true

        int[] arr2 = {1, 2, 4, 8, 16};
        System.out.println(binarySearch(arr2, 3)); // false
    }
}
