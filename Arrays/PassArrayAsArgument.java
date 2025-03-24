package Arrays;

public class PassArrayAsArgument {

    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }

    }

    public static void main(String[] args) {

        int marks[] = { 21, 31, 41, 51, 61 };

        update(marks);

        // print our array
        for (int i : marks) {
            System.out.print(i + "  ");
        }

    }

}
