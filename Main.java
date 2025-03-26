public class Main {

  public static int binarySearch(int arr[], int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {

      int mid = (start + end) / 2;

      if (arr[mid] == target) {
        return mid;

      }

      if (arr[mid] < target) {
        // right
        start = mid + 1;

      } else {
        // left
        end = mid - 1;
      }

    }

    return -1;
  }

  public static void main(String[] args) {

    int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
    int target = 18;

    int idx = binarySearch(arr, target);

   if (idx != -1) {
    System.out.println("element found at index: " + idx);
    
   } else {
    System.out.println("element not found!");
   }
  }
}