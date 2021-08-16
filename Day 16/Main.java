import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class InsertionSort {
    void sort(int n, List<Integer> arr) {
        int data = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) > data) {
                arr.set(i + 1, arr.get(i));
                for (int j : arr)
                    System.out.print(j + " ");
                System.out.println();
                arr.set(i, data);
            }
        }
        for (int j : arr)
            System.out.print(j + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter no of array elements: ");
        int n = inp.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(inp.nextInt());
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(n, arr);
        inp.close();
    }
}
