package Arrays;

public class PairsInArray {

    public static void printPairs(int arr[]) {

        int tot = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                System.out.print("(" + arr[i] + ", " + arr[j] + ")");
                tot++;

            }
            System.out.println();
        }

        System.out.println("Total Pairs: " + tot);

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10 };

        printPairs(arr);
    }
}