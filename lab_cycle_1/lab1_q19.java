import java.util.Arrays;

public class lab1_q19 {
    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 1, 5};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}